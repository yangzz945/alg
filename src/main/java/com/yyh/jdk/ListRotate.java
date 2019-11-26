package com.yyh.jdk;
/*     
 created by yangzhizhong at 2019/2/21   
 */

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

public class ListRotate {

    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("a","b","c","d","e");
        int distince = list.size()/2-1;
        Collections.rotate(list,distince);

        System.out.println(list);
    }
}


