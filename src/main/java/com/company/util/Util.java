package com.company.util;

/**
 * Created by Yevgen on 06.01.2016.
 */

public class Util {

    public static String toString(Object object) {
        String result;
        if (object == null) {
            result = "null";
        } else {
            result = object.toString();
            if (object instanceof String) {
                result =  "\"" + result + "\"";
            }
        }

        return result;
    }


    public static long getNanoTime() {
        return System.nanoTime();
    }

    public static Long nanoToMicroTime(Long nanoTime) {
        return (nanoTime == null) ? null : (nanoTime / 1000);
    }

    public static String getApplicationMainClassName() {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        StackTraceElement main = stack[stack.length - 1];

        return main.getClassName();
    }

    public static Class getApplicationMainClass() {
        Class result;

        try {
            result = Class.forName(getApplicationMainClassName());
        } catch (ClassNotFoundException e) {
            // Unfortunately, it is difficult to recognize what could be the reason of such situation, but
            // now try to get it from stack directly
            StackTraceElement[] stack = Thread.currentThread().getStackTrace();
            StackTraceElement main = stack[stack.length - 1];
            result = main.getClass();
        }

        return result;
    }

}