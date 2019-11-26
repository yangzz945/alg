package com.yyh.jdk;
/*     
 created by yangzhizhong at 2019/8/9   
 */

public class TestWithoutVolatile {
    static boolean status=false;

    static int i;

    public static void main(String[] args) throws Exception {
        new Thread(new WaitExitRunnable()).start();

        //此处必须让WaitExitRunnable线程先运行一段时间才能测试成功！
        //个人推测原因是WaitExitRunnable线程运行一段时间后才会将共享内存中的status缓存到本地内存，以后读都从自己本地内存读
        //Thread.sleep(1000);

        new Thread(new SwapRunnable()).start();
    }

    /**
     * 测试volatile变量影响的关键线程，无限读取并比较status和!status的值，根据程序是否退出来判断volatile关键字的影响
     */
    static class WaitExitRunnable implements Runnable {
        @Override
        public void run() {
            while (true) {
                //System.out.println(i++);
                // if条件里是非原子型判断操作；如果status值不变，会无限循环，过不去判断条件；但有SwapRunnable线程无限改变status值，所以推测可能存在这种情况：
                // 读status和读!status之间status发生一次变化，这样判断条件就能通过，程序退出！
                boolean innerStatus=status;
                if (status) {
                    System.out.println("exit");
                    System.exit(0);
                } else {
                    System.out.println("status is "+status);
                }
            }
        }
    }

    /**
     * 无限交换status和!status的值，看WaitExitRunnable线程能否观察到影响
     */
    static class SwapRunnable implements Runnable {
        @Override
        public void run() {
            //无限修改status的值
            //while (true) {
                status = true;
            //}
        }
    }

}
