package com.yyh.jdk;
/*     
 created by yangzhizhong at 2020/10/26   
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {


    private int cacheSize;

    private LRUCache(int size) {
        super(size,0.75f,true);
        //this.size= size;
        this.cacheSize = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>this.cacheSize;
    }


}
