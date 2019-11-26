package com.yyh.jdk;
/*     
 created by yangzhizhong at 2018/12/27   
 */

import com.google.common.collect.Lists;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TimeTest {

    public TimeTest() {
    }

    public static void  main(String[] args) {
        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        //LocalDateTime.now().getSecond();
        System.out.println(LocalDateTime.now().getHour()*3600);
        System.out.println(LocalDateTime.now().getMinute()*60);
        System.out.println(LocalDateTime.now().getSecond());

        int sec = LocalDateTime.now().getHour()*3600+LocalDateTime.now().getMinute()*60+LocalDateTime.now().getSecond();
        System.out.println(sec);
        List<Integer> intList = Lists.newArrayList(1,2,3);
        IntSummaryStatistics summaryStatistics = intList.stream().collect(Collectors.summarizingInt(a->a.intValue()));
    }
}
