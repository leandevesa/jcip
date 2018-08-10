package com.jcip.controller.chapter.three.ex.one;

public class NoVisibility {

    private static boolean ready;
    private static int number;

    private static class Yield extends Thread {
        public void run() {
            while (!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    private static class Sum extends Thread {
        public void run() {
            int a = 0;
            while (!ready) {
                a++;
            }
            System.out.println(a);
        }
    }

    private static void init() {
        ready = false;
        number = -1;
    }

    public static void runYield() throws Exception {
        init();
        new Yield().start();
        Thread.sleep(100);
        number = 42;
        ready = true;
    }

    public static void runSum() throws Exception {
        init();
        new Sum().start();
        Thread.sleep(100);
        number = 42;
        ready = true;
    }
}