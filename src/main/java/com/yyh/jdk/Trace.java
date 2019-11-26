package com.yyh.jdk;
/*     
 created by yangzhizhong at 2018/11/18   
 */

public class Trace {
    public Trace() {
        System.out.println(Thread.currentThread().toString()+" new");
    }
    public static void accumulate(Object t, int value) {
        //System.out.println(vaule);
        ;
        System.out.println(Thread.currentThread().toString()+"accumulate");
    }

    public  static void combine(Object t,Object u) {
        System.out.println(Thread.currentThread().toString()+"combine");
    }

    /*public Trace get() {
        return new Trace();
    }*/
}
