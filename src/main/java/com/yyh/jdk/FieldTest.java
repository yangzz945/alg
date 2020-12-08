package com.yyh.jdk;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Map;

/**
 * Created by youku on 2018/5/20.
 */
public class FieldTest {

    public static void main(String[] args) {
        Map<String,String> map = Maps.newHashMap();
        map.put("1","1");
        map.put("2","2");

        System.out.println(map);

        Map<String,String> map4 = Maps.newHashMap();
        map4.put("1","1");
        map4.put("2","2");
        map4.put("3","3");
        //map.put("3","3");

        System.out.println(map4);
        System.out.println(map);

        Map<String,String> map2 = map;

        Map<String,String> map3 = Maps.newHashMap();
        map3.putAll(map);

        System.out.println(map3);

        Map<String,Object> objMap = Maps.newHashMap();
        objMap.put("1",1.0);

       // String obj = (String)objMap.get("1");
       // System.out.println(obj);



        for (int i=0;i<100;i++) {
            if (i==50) {
                break;
            } else {
                System.out.println(i);
            }

        }

    }
}
