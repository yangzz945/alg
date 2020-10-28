package com.yyh.jdk;
/*     
 created by yangzhizhong at 2020/8/11   
 */

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class ParalMap {

    public static void main(String[] args) {
        Map<String,Number> map = Maps.newHashMap();
        for (int i=0;i<10000;i++) {
            map.put(String.valueOf(i), i);
        }

        long start;


         start = System.currentTimeMillis();
         Map<String,Float> resultMap2 = Maps.newHashMap();
         map.forEach((k,v)
                 ->{
             resultMap2.put(k,v.floatValue());
                 }
         );
        System.out.println("cost="+(System.currentTimeMillis()-start));


        start = System.currentTimeMillis();
        Map<String,Float> resultMap = map.entrySet().parallelStream().collect(Collectors.toMap(e->e.getKey(),e->e.getValue().floatValue()));
        for(Map.Entry<String,Float> entry:resultMap.entrySet()) {
            float f1 = Float.parseFloat(entry.getKey());
            if (f1!=entry.getValue()) {
                System.out.println("error");

            }
        }

        System.out.println("cost="+(System.currentTimeMillis()-start));




        int len = 100000;
        Number[] numbers = new Number[len];
        for (int i=0;i<len;i++) {
            numbers[i]=i;
        }

        start = System.currentTimeMillis();
        double[] floats1 = new double[len];
        Arrays.parallelSetAll(floats1,i-> {
            return numbers[i].doubleValue();
        });

        System.out.println("cost="+(System.currentTimeMillis()-start));


        start = System.currentTimeMillis();
        double[] floats = new double[len];
        for(int i=0;i<len;i++) {
            floats[i]=numbers[i].doubleValue();
        }


        System.out.println("cost="+(System.currentTimeMillis()-start));






    }
}
