package com.yyh.mapdb;
/*     
 created by yangzhizhong at 2019/12/20   
 */

import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.HTreeMap;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public class MapTest {

    public static void main(String[] args) {

        MapTest.memoryDB();

        MapTest.offheapMemoryDB();

        List<byte[]> list = new ArrayList<>();
        String a="a";
        String b="b";
        list.add(a.getBytes());
        list.add(b.getBytes());
        byte[][] needgetKeys = list.toArray(new byte[list.size()][]);




    }

    public static void memoryDB() {
        DB db = DBMaker.memoryDB().make();
        ConcurrentMap map = db.hashMap("map").make();
        map.put("something", "here");

        System.out.println(map.get("something"));
    }

    public static void offheapMemoryDB() {
        DB db = DBMaker.memoryDB().make();
        HTreeMap cache = db
                .hashMap("cache")
                .expireAfterUpdate(10, TimeUnit.MINUTES)
                .expireAfterCreate(10, TimeUnit.SECONDS)
                .expireAfterGet(1, TimeUnit.MINUTES)
                .create();

        cache.put("1","1");
        try {
            Thread.sleep(7000);
            System.out.println(cache.get("1"));
            Thread.sleep(3000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(cache.get("1"));


    }
}
