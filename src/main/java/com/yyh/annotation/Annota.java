package com.yyh.annotation;
/*     
 created by yangzhizhong at 2020/8/21   
 */

import java.lang.annotation.Annotation;
import java.util.Arrays;

//@Deprecated
//@SuppressWarnings({"123","456"})
@MyAnnotation()
public class Annota {


    @MyAnnotation
    public static void main(String[] args) {

        @MyAnnotation
        Annotation[] annotations = Annota.class.getAnnotations();
        System.out.println(Arrays.toString(annotations));


        //annotations = Annota.class.getDeclaredAnnotations();


        //System.out.println(Arrays.toString(annotations));
    }
}
