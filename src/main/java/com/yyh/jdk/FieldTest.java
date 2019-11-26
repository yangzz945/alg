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

        Map<String,String> map2 = map;

        Map<String,String> map3 = Maps.newHashMap();
        map3.putAll(map);

        System.out.println(map3);
    }
}
