package com.yyh.jdk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by youku on 2018/5/21.
 */
public class LocalDateTimeTest {

    public static void main(String[] args) {
        String beforeDay = LocalDateTime.now().minusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(beforeDay);

        long end =  new Date().getTime() / 1000;
        System.out.println(end);

        System.out.println(System.currentTimeMillis()/1000);
    }
}
