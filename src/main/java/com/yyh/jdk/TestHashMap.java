package com.yyh.jdk;
/*     
 created by yangzhizhong at 2018/11/28   
 */

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class TestHashMap {

    public  static void main(String[] args) {

        long abc = 123456L;
        Map<String,Float> map = Maps.newHashMap();
        map.put("123",(float)abc);
        System.out.println(map);

        List<Integer> list = Lists.newArrayList();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);

        for (int i = 0 ;i<1000;i++) {
                                  list.add(1);
                                  list.add(2);
        }

        List<Integer> existSet = Lists.newArrayList(1,2);


        List<Integer> filterList = Lists.newArrayList();

        long start = System.currentTimeMillis();
        List<Integer> result = list.stream().filter(ele-> {
            if (existSet.contains(ele)) {
                return true;
            } else {

                filterList.add(ele);
                return false;
            }
        }).collect(Collectors.toList());

        long cost = System.currentTimeMillis()-start;

        System.out.println("cost:"+cost);
        System.out.println(result);
        System.out.println(filterList);


    }
}
