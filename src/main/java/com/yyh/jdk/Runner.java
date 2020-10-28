package com.yyh.jdk;
/*     
 created by yangzhizhong at 2020/10/14   
 */

import java.util.concurrent.CountDownLatch;

public class Runner implements Runnable {

    private int index;
    private CountDownLatch latch1;
    private CountDownLatch latch2;
    private CountDownLatch latch3;
    public Runner(int i,CountDownLatch latch1,CountDownLatch latch2,CountDownLatch latch3) {
        this.index = i;
        this.latch1 = latch1;
        this.latch2 = latch2;
        this.latch3 = latch3;
    }

    @Override
    public void run()   {
        try {
            System.out.println("runner:" + index + " waiting to start");
            latch1.countDown();
            System.out.println("runner:" + index + " ready ");


            latch3.await();

            System.out.println("runner:" + index + " run end");
            latch2.countDown();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {

        CountDownLatch latch1 = new CountDownLatch(3);

        CountDownLatch latch2 = new CountDownLatch(3);

        CountDownLatch latch3 = new CountDownLatch(1);





        new Thread(new Runner(1,latch1,latch2,latch3)).start();
        new Thread(new Runner(2,latch1,latch2,latch3)).start();
        new Thread(new Runner(3,latch1,latch2,latch3)).start();


        System.out.println("runner readying ！");
        latch1.await();


        System.out.println("开始");
        latch3.countDown();





        System.out.println("waiting to end");
        latch2.await();

    }

}
