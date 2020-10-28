package com.yyh.alg;
/*     
 created by yangzhizhong at 2020/8/3   
 */

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RawDoubleFg implements FgTest {

    @Override
    public Map<String, Number> fg(int a, int b) {
        Map<String,Number> res = Maps.newHashMap();
        res.put("1",1.0d);
        return res;
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<Number>();
        numbers.add(Long.valueOf(1));
        numbers.add(Double.valueOf(2.123456));

        float[] fArray = new float[2];
        for(int i=0;i<numbers.size();i++) {
            fArray[i]=numbers.get(i).floatValue();
        }


        for (int i=0;i<fArray.length;i++) {
            System.out.println(fArray[i]);
        }

    }
}
