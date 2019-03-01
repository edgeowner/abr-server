package com.atmatrix.abr.common.log;

import com.atmatrix.abr.common.util.RequestUtil;
import com.google.gson.Gson;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: abr-server
 * @ClassName: WebLogAspect
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-20 6:03 PM
 **/

@Aspect
@Component
@Order(1)
@Slf4j
public class WebLogAspect {

    private ThreadLocal<Long> startTime = new ThreadLocal<>();

    private Gson gson = new Gson();


    @Pointcut("execution(public * com.atmatrix.abr.controller.*.*(..))")
    public void webLog() {
    }


    @Before("webLog()")
    public void doBefore() {
        startTime.set(System.currentTimeMillis());
    }

    @AfterReturning(value = "webLog()", returning = "object")
    public void doAfterReturning(Object object) {
        // 处理完请求，返回内容
        log.info(MessageFormat.format("WebLogAspect Response Data: [{0}]", gson.toJson(object)));
    }

    @Around("webLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        //获取当前请求对象
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //记录请求信息(通过logstash传入elasticsearch)
        WebLog webLog = new WebLog();
        Object result = joinPoint.proceed();
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        if (method.isAnnotationPresent(ApiOperation.class)) {
            ApiOperation apiOperationlog = method.getAnnotation(ApiOperation.class);
            webLog.setDescription(apiOperationlog.value());
        }
        long endTime = System.currentTimeMillis();
        String ip = request.getRemoteAddr();
        String basePath = RequestUtil.getBasePath(request);
        String requestMethod = request.getMethod();
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = methodSignature.getName();
        String requestURI = request.getRequestURI();
        String requestURL = request.getRequestURL().toString();
        Object params = getParameter(method, joinPoint.getArgs());
        Integer executeTime = (int) (endTime - startTime.get());

        webLog.setBasePath(basePath);
        webLog.setIp(ip);
        webLog.setMethod(requestMethod);
        webLog.setParameter(params);
        webLog.setResult(result);
        webLog.setSpendTime(executeTime);
        webLog.setStartTime(startTime.get());
        webLog.setUri(requestURI);
        webLog.setUrl(requestURL);
        log.info(MessageFormat.format("WebLogAspect Request: Method: [{0}]", requestMethod));
        log.info(MessageFormat.format("WebLogAspect Request: URI: [{0}]", request.getRequestURI()));
        log.info(MessageFormat.format("WebLogAspect Request: URL: [{0}]", request.getRequestURL().toString()));
        log.info(MessageFormat.format("WebLogAspect Request: Params: [{0}]", params));
        log.info(MessageFormat.format("WebLogAspect Request: IP: [{0}]", ip));
        log.info(MessageFormat.format("WebLogAspect Request: Execute Time: [{0}]", executeTime));
        log.info(MessageFormat.format("WebLogAspect Class Method Names: [{0}.{1}]", className, methodName));
        log.info(MessageFormat.format("WebLogAspect Class Method Description: [{0}]", webLog.getDescription()));
        return result;
    }

    /**
     * 根据方法和传入的参数获取请求参数
     */
    private Object getParameter(Method method, Object[] args) {
        List<Object> argList = new ArrayList<>();
        Parameter[] parameters = method.getParameters();
        for (int i = 0; i < parameters.length; i++) {
            RequestBody requestBody = parameters[i].getAnnotation(RequestBody.class);
            if (requestBody != null) {
                argList.add(args[i]);
            }
            RequestParam requestParam = parameters[i].getAnnotation(RequestParam.class);
            if (requestParam != null) {
                Map<String, Object> map = new HashMap<>();
                String key = parameters[i].getName();
                if (!StringUtils.isEmpty(requestParam.value())) {
                    key = requestParam.value();
                }
                map.put(key, args[i]);
                argList.add(map);
            }
        }
        if (argList.size() == 0) {
            return null;
        } else if (argList.size() == 1) {
            return argList.get(0);
        } else {
            return argList;
        }
    }
}
