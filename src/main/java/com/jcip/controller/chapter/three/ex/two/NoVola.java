package com.jcip.controller.chapter.three.ex.two;

public class NoVola {
    private static int COUNTER = 0;

    static class CounterChecker implements Runnable {
        final int limit;
        public CounterChecker(int limit) {
            this.limit = limit;
        }
        public void run() {
            int c = COUNTER;
            while (c != limit) {
                if (c != COUNTER) {
                    System.out.println(String.format("COUNTER has changed from %d to %d", c, COUNTER));
                }
                c = COUNTER;
            }
            System.out.println("End checkCounter");
        }
    }
    public static void run() throws Exception {
        int limitValue = 10;
        Thread t = new Thread(new CounterChecker(limitValue));
        t.start();
        System.out.println("Starting CounterChecker");
        for (int i=0; i <= limitValue; i++) {
            COUNTER = i;
            Thread.sleep(100);
        }
        System.out.println("Main thread finished");
    }
}