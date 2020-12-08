package com.yyh.jdk;
/*     
 created by yangzhizhong at 2020/12/7   
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LRUCache2<K,V> {

    private int cap;
    private Map<K,V> map = new HashMap<>();
    private LinkedList<K> list = new LinkedList<>();

    public LRUCache2(int cap) {
        this.cap = cap;
    }

    public V get(K k) {
        if (map.containsKey(k)) {

            list.removeFirstOccurrence(k);
            list.addFirst(k);
            return map.get(k);

        }
        return null;
    }

    public void put(K k,V v) {
        if (map.containsKey(k)) {

            list.removeFirstOccurrence(k);
            list.addFirst(k);

        } else {

            map.put(k,v);
            list.addFirst(k);
        }

        if (map.size()>=this.cap) {

            K lK = list.getLast();
            map.remove(lK);
            list.removeLast();

        }

    }
}
