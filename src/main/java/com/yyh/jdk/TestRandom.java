package com.yyh.jdk;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by youku on 2018/6/22.
 */
public class TestRandom {

    public  static void main(String[] args) {

        for (int i=0;i<100;i++) {
            System.out.println(ThreadLocalRandom.current().nextInt(10));
        }


    }
}
