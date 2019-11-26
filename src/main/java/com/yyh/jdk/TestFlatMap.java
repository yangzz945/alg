package com.yyh.jdk;
/*     
 created by yangzhizhong at 2018/11/19   
 */

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class TestFlatMap {
    private final static String[][] attr_itemIds = {
            {"1", "sales.detail", "sales_id","23"},
            {"2", "sales.detail", "sale_id"},
            {"3","hotel.detail", "hotel_id"}
    };

    public static void main(String[] args) {
        for (String[] strArra : attr_itemIds) {
            for (String str : strArra) {
                System.out.println(str);
            }
        }

        /*//String[] words = new String[]{"Hello","World"};
        Stream<String> stream = Arrays.stream(words);
        System.out.println(stream.toArray());

        List<String[]> a = Arrays.stream(words)
                .map(word -> word.split(""))
                .distinct()
                .collect(toList());

        a.forEach(System.out::print);*/
        //System.out.println(parse("abc"));
        List<String> strs = Arrays.asList("abc","def","abc");

        List<String> result = strs.parallelStream().map(ele->{return parse(ele);})
                .flatMap(ele->ele.stream()).collect(toList());

        System.out.println(result);


        Map<String,List<String>>  re = strs.parallelStream().map(key-> {

            Map.Entry<String,List<String>> entry = new HashMap.SimpleEntry<String,List<String>>(key,Arrays.asList(key));
            //Map<String,List<String>> tmpMap = Maps.newHashMap();
           //tmpMap.put(key,Arrays.asList(key));
            return entry;
        }).collect(Collectors.toMap(entry->entry.getKey(),entry->entry.getValue(),(s1,s2)->s1));

        System.out.println(re);


    }

    public static List<String> parse(String str) {
        return Arrays.asList(str.split(""));
    }
}
