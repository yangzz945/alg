package com.yyh.jdk;
/*     
 created by yangzhizhong at 2020/10/12   
 */

public class Random {

    public static void main(String[] args) {


        for (int i=0;i<100;i++) {
            int iRandom = (int)(1+Math.random()*100);
            System.out.println(iRandom);
        }
    }
}
