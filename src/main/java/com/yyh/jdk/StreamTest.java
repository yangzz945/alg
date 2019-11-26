package com.yyh.jdk;
/*     
 created by yangzhizhong at 2019/4/17   
 */

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class StreamTest {
    public static void  main(String[] args) {
        List<Long> sessionDataList = Lists.newArrayList();
        for (long i = 0;i<10000;i++) {
            sessionDataList.add(i);
        }



        List<Long> result = sessionDataList
                .stream()
                .sorted((e1,e2)-> Long.compare(e2, e1))
                .limit(30)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
