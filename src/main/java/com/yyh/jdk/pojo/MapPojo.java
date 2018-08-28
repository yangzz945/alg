package com.yyh.jdk.pojo;

import org.apache.commons.lang3.reflect.FieldUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by youku on 2018/5/20.
 */
public class MapPojo {
    private Map<String,String> map = new HashMap<String,String>(){
        {
            put("1","1");
        }
    };

    public static void main(String[] args) {

    try {
        FieldUtils.getDeclaredField(MapPojo.class, "map");
        MapPojo mapPojo = new MapPojo();
        Map<String, String> testMap = (Map<String, String>)FieldUtils.readDeclaredField(mapPojo, "map",true);
        System.out.println(testMap);
        testMap.put("2","2");
        System.out.println(testMap);
    } catch (Throwable t) {
        t.printStackTrace();;
    }

    }
}
