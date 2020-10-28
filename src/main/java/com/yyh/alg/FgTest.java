package com.yyh.alg;
/*     
 created by yangzhizhong at 2020/8/3   
 */

import java.util.Map;

public interface FgTest {

    //Map<String,Float> fg(int a,int b);
    Map<String,? extends Number> fg(int a,int b);
}
