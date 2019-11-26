package com.yyh.jdk;
/*     
 created by yangzhizhong at 2019/8/9   
 */

import java.util.concurrent.TimeUnit;

public class VolatileExample {

    private volatile static boolean BOOL_0 = true;
    private volatile static  boolean BOOL = true;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            while (BOOL_0) { }
            System.out.println("exit0,"+BOOL);

        }).start();

        TimeUnit.MILLISECONDS.sleep(500);

        new Thread(() -> {
            while (BOOL) { }
            System.out.println("exit1,"+BOOL);

        }).start();
        TimeUnit.MILLISECONDS.sleep(500);

        BOOL_0=false;
        BOOL = false;
    }
}
