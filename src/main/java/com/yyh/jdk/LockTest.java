package com.yyh.jdk;

import java.util.concurrent.locks.LockSupport;

/**
 * 描述:
 * lockTest
 * com.yyh.jdk.LockTest
 *
 * @author yangzhizhong
 * @date 2018/8/7
 * <p>
 * config_start:
 * |com.yyh.jdk.LockTest|lockTest|yangzhizhong|
 * config_end:
 */
public class LockTest {
    public static void  main(String[] args) {
        System.out.println("begin");
        LockSupport.parkNanos(10000);
        System.out.println("end");
    }
}
