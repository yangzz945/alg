package com.yyh.jdk;
/*     
 created by yangzhizhong at 2019/8/9   
 */

public class TestVolatile {

    private volatile static VolatileHolder volatileHolder = new VolatileHolder();
    private static NoVolatileHolder noVolatileHolder = new NoVolatileHolder();

    private volatile  static boolean status;
    public static void main(String[] args) throws Exception {




        WriteThread writeThread = new WriteThread();
        writeThread.start();

        Thread.sleep(4000);



        ReadThread readThread = new ReadThread();
        readThread.start();



    }

    public static class WriteThread  extends Thread {
        private VolatileHolder vh;
        private NoVolatileHolder nh;
        private int id;

        @Override
        public void run() {


            while (true) {
                status = !status;
                //this.vh.setFlag(!volatileHolder.isFlag());
                //volatileHolder.flag=!volatileHolder.flag;
            }

            /*this.nh.setFlag(true);
            this.vh.setFlag(true);

            if (!this.nh.isFlag()) {
                System.out.println(this.id + ",wrong!" + "vh=" + this.vh.isFlag() + ",nh=" + this.nh.isFlag());
            } else {
                System.out.println(this.id + ",right!" + "vh=" + this.vh.isFlag() + ",nh=" + this.nh.isFlag());
            }*/

        }
    }

    public static class ReadThread  extends Thread {
        private VolatileHolder vh;
        private NoVolatileHolder nh;
        private int id;

        @Override
        public void run() {

            //this.nh.setFlag(true);
            //this.vh.setFlag(true);
            while (true) {
                System.out.println(id++);
                // if条件里是非原子型判断操作；如果status值不变，会无限循环，过不去判断条件；但有SwapRunnable线程无限改变status值，所以推测可能存在这种情况：
                // 读status和读!status之间status发生一次变化，这样判断条件就能通过，程序退出！
                //if (volatileHolder.flag == !volatileHolder.flag) {
                if (status==!status) {
                    System.out.println("exit");
                    System.out.println("id="+id);

                    System.exit(0);
                }
            }



        }
    }

    public static class VolatileHolder {
        public volatile  boolean flag=false;


    }

    public static class NoVolatileHolder {
        public boolean flag=false;


    }
}
