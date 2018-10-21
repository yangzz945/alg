package com.yyh.jdk;
/*     
 created by yangzhizhong at 2018/10/19   
 */

import com.google.common.collect.Lists;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.apache.commons.math3.linear.RealMatrix;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.List;

public class StopWatchTest {
    public static void main(String[] args) throws InterruptedException {
        /*StopWatch watch = new StopWatch();
        watch.start();

        //统计从start开始经历的时间
        Thread.sleep(1000);
        System.out.println(watch.getTime());

        //统计计时点
        Thread.sleep(1000);
        watch.split();
        System.out.println(watch.getSplitTime());

        //统计计时点
        Thread.sleep(1000);
        watch.split();
        System.out.println(watch.getSplitTime());

        //复位后, 重新计时
        watch.reset();
        watch.start();
        Thread.sleep(1000);
        System.out.println(watch.getTime());

        //暂停 与 恢复
        watch.suspend();
        System.out.println("暂停2秒钟");
        Thread.sleep(2000);

        watch.resume();
        Thread.sleep(1000);
        watch.stop();
        System.out.println(watch.getTime());*/
        List<Float> floatList = Lists.newArrayList();
        for (int i = 0;i<10000;i++) {
            floatList.add((float)i);
        }

        //(float[])floatList.toArray();
        //ArrayUtils.toPrimitive();
        //Lists.
        //
        //ArrayUtils.toPrimitive()
        LocalDate oldDate = LocalDate.parse("20181018", DateTimeFormatter.ofPattern("yyyyMMdd"));//yyyyMMdd yyyy-MM-dd hh:mm:ss
        long diff = oldDate.until(LocalDate.now(), ChronoUnit.DAYS);
        System.out.println(diff);

        oldDate = LocalDate.parse("2018-10-09 22:32:52", DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));//yyyyMMdd yyyy-MM-dd hh:mm:ss
        System.out.println(oldDate.toString());
        diff = oldDate.until(LocalDate.now(), ChronoUnit.DAYS);
        System.out.println(diff);

        //System.out.println(LocalDate.now(ZoneId.of("CTT")));
        System.out.println(Clock.systemDefaultZone());

        //RealMatrix
    }
}
