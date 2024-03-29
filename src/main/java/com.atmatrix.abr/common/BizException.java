package com.atmatrix.abr.common;

/**
 * Created by fgm on 2016/11/14.
 */
public class BizException extends RuntimeException{

    private String errorCode;

    private String errorMessage;

    //普通异常
    public static final String NUM_EXCEPTION = "-1";
    //业务处理异常
    public static final String NUM_BIZ_ERROR = "-2";
    //数据校验异常
    public static final String NUM_VALIDATION = "1";
    //已经初始化
    public static final String NUM_ALREADY_INIT="3";

    //获取流程失败
    public static final String NUM_FLOW_STATUS = "501";
    //正态分布不符合提示
    public static final String NUM_DISTRIBUTE_WARN="299";

    public BizException(){
        super("业务异常");
        this.errorCode=NUM_EXCEPTION;
        this.errorMessage="业务异常";
    }

    public BizException(String errorCode, String errorMessage){
        super(errorMessage);
        this.errorCode=errorCode;
        this.errorMessage=errorMessage;
    }

    public BizException(String errorMessage){
        super(errorMessage);
        this.errorCode=NUM_EXCEPTION;
        this.errorMessage=errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
