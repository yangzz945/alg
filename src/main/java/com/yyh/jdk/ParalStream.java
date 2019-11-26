package com.yyh.jdk;
/*     
 created by yangzhizhong at 2018/11/18   
 */

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
//import com.sun.management.jmx.Trace;
//import com.sun.deploy.trace.Trace;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParalStream {

    public  static void main(String[] args) {
        /*int COUNT =10000;
        float[] arr = new float[COUNT];
        List<Float> floatList = Lists.newArrayList();
        for (int i=0;i<COUNT;i++) {
            //arr[i]=i;
            floatList.add((float)i);
        }



        long start = System.nanoTime();
        for (int i=0;i<COUNT;i++) {
            arr[i]=floatList.get(i);
        }
        System.out.println("cost:"+(System.nanoTime()-start));


        start = System.nanoTime();

        //int i=0;
        floatList.parallelStream().forEach(e->{
            //arr[i]=e;
        });

        System.out.println("cost:"+(System.nanoTime()-start));*/

        /*IntStream.range(0, 4)
                .parallel()
                .collect(Trace::new, Trace::accumulate, Trace::combine);*/
        /*List<String> toProcess = Lists.newArrayList();
        for(int i=0;i<20;i++) {
            toProcess.add(String.valueOf(i));
        }*/

// should be ["a", "b", "c"]
       /* List<Integer> results = toProcess.parallelStream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
        System.out.println(results);*/

        Map<String,Double> map = Maps.newHashMap();
        for (int i=0;i<10000;i++) {
            map.put(String.valueOf(i), ThreadLocalRandom.current().nextDouble());
        }

        long start =System.currentTimeMillis();
        DoubleSummaryStatistics statistics = map.entrySet().stream().mapToDouble(Map.Entry::getValue).summaryStatistics();

        long end = System.currentTimeMillis();

        long cost = end-start;
        System.out.println(cost);



        start =System.currentTimeMillis();
        statistics = map.entrySet().parallelStream().mapToDouble(Map.Entry::getValue).summaryStatistics();

        end = System.currentTimeMillis();

        cost = end-start;



        System.out.println("para:"+cost);

        start =System.currentTimeMillis();
        statistics = map.entrySet().parallelStream().unordered().mapToDouble(Map.Entry::getValue).summaryStatistics();

        end = System.currentTimeMillis();

        cost = end-start;

        System.out.println("para-unordered:"+cost);






    }
}
