package com.yyh.jdk;

import java.util.Set;
import java.util.TreeMap;

/**
 * Created by youku on 2018/4/9.
 */
public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(0, "zero");
        tm.put(1, "one");
        tm.put(3, "three");
        tm.put(2, "two");
        // System.out.println(tm);// {0=zero, 1=one, 2=two, 3=three}
        // System.out.println(tm.keySet());// [0, 1, 2, 3]
        // System.out.println(tm.values());// [zero, one, two, three]

        Set<Integer> keys = tm.keySet();// set本身就是一个集合
        for (Integer key : keys) {
            System.out.println("学号：" + key + ",姓名：" + tm.get(key) + "\t");
        }
        System.out.println(tm.firstKey());
    }
}
