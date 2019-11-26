package com.yyh.alg;
/*     
 created by yangzhizhong at 2019/2/12   
 */

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.util.Map;

public class ToStringBuilderTest {

    public static void main(String[] args) {
        List<Map<String,Float>> list = Lists.newArrayList();
        Map<String,Float> map = Maps.newHashMap();
        map.put("123456",1f);
        map.put("1234567",2f);

        list.add(map);

        System.out.println(list);

        String str = new ToStringBuilder(list).toString();//.build();
        System.out.println(str);
    }
}
