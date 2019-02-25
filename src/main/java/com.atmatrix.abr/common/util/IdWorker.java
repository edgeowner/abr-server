package com.atmatrix.abr.common.util;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhangcan03 16/10/21.
 */
public class IdWorker {

    public static final long MILLI_SECOND_OF_2016_01_01 = 1454293365812l;
    public static volatile AtomicInteger MILLI_SECOND_SEQUENCE = new AtomicInteger(0);

    public static Integer machineId = new Random().nextInt(256);
    public static final int LENGTH_OF_MACHINE_ID = 8;
    public static final int LENGTH_OF_RESERVE_BIT = 7;
    public static final int LENGTH_OF_MILLI_SECOND_SEQUENCE = 7;

    public static long getId() {
        long milliSecond = getMilliSecond() << (LENGTH_OF_MACHINE_ID + LENGTH_OF_RESERVE_BIT + LENGTH_OF_MILLI_SECOND_SEQUENCE);
        long machineId = getMachineIdFix();
        long milliSecondSequence = getMilliSecondSequence();


        return milliSecond ^ machineId ^ milliSecondSequence;
    }

    private static long getMachineIdFix() {
        return getMachineId() << (LENGTH_OF_RESERVE_BIT + LENGTH_OF_MILLI_SECOND_SEQUENCE);
    }


    private static long getMilliSecondSequence() {
        if (MILLI_SECOND_SEQUENCE.get() == 127) {
            MILLI_SECOND_SEQUENCE.set(0);
        }

        return MILLI_SECOND_SEQUENCE.incrementAndGet();
    }

    private static int getMachineId() {
        return machineId;
    }

    private static long getMilliSecond() {
        Date now = new Date();

        return now.getTime() - MILLI_SECOND_OF_2016_01_01;
    }

    public static void main(String[] args) {
        System.out.println(IdWorker.getId());
    }
}

