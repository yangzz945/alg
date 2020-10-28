package com.yyh.alg;
/*     
 created by yangzhizhong at 2020/8/3   
 */

import com.google.common.collect.Maps;

import java.util.Map;

public class RawFg implements FgTest {

    @Override
    public Map<String, Float> fg(int a, int b) {
        Map<String,Float> res = Maps.newHashMap();
        res.put("1",1.0f);
        return res;
    }
}
