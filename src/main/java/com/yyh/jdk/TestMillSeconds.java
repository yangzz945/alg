package com.yyh.jdk;

/**
 * Created by youku on 2018/7/9.
 */
public class TestMillSeconds {

    public  static void main(String[] args) {
        System.out.println(System.currentTimeMillis()+3600000);
        String str = "WcDbu6RTdDkDACiYvwP01CiB+6598";
        System.out.println(Math.abs(str.hashCode()%1000));
    }
}
