package com.yyh.jdk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by youku on 2018/5/21.
 */
public class LocalDateTimeTest {

    public static void main(String[] args) {
        String beforeDay = LocalDateTime.now().minusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.print(beforeDay);
    }
}
