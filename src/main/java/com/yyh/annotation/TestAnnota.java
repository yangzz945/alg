package com.yyh.annotation;
/*     
 created by yangzhizhong at 2020/8/21   
 */

import java.lang.reflect.Method;

public class TestAnnota {

    @Hello(value="hello world!")
    public static void main(String[] args) throws Exception {
        Class cls = TestAnnota.class;
        Method method = cls.getMethod("main",String[].class);
        Hello hello = method.getAnnotation(Hello.class);
        System.out.println(hello.value());

        System.out.println("exec end!");

    }

}
