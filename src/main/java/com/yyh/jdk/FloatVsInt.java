package com.yyh.jdk;
/*     
 created by yangzhizhong at 2020/7/24   
 */

public class FloatVsInt {

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);

        Float f = new Float(Integer.MAX_VALUE);


        System.out.println(f.intValue());


        String str = "12237235";//10237235  1048575
        Float f1 = Float.parseFloat(str);
        //int i1 = (int)f1;
        System.out.println(f1.intValue());
        //System.out.println(f1.);
    }
}
