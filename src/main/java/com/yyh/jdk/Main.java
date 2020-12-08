package com.yyh.jdk;
/*     
 created by yangzhizhong at 2020/12/3   
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        LRUCache<String,String> lruCache = new LRUCache<>(3);

        lruCache.put("1","1");
        lruCache.put("2","1");
        lruCache.put("3","1");
        lruCache.put("4","1");
        //lruCache.put("1","1");


        System.out.println(lruCache);


    }

    public static class LRUCache<K,V> extends LinkedHashMap<K,V> {


        private int cacheSize;

        public LRUCache(int size) {
            super(size,0.75f,true);
            //this.size= size;
            this.cacheSize = size;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size()>this.cacheSize;
        }


    }
}
