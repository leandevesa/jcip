package com.jcip.controller.chapter.three.ex.four;

public class RequestContext {

    private static ThreadLocal<String> UOW = new ThreadLocal<>();
    private static ThreadLocal<String> RID = new ThreadLocal<>();

    public static void setUOW(String someUOW) {
        UOW.set(someUOW);
    }

    public static void setRID(String someId) {
        RID.set(someId);
    }

    public static String getUOW() {
        return UOW.get();
    }

    public static String getRID() {
        return RID.get();
    }
}