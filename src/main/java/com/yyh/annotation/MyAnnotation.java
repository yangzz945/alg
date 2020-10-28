package com.yyh.annotation;
/*     
 created by yangzhizhong at 2020/8/21   
 */


import java.lang.annotation.*;

//当注解未指定Target值时，则此注解可以用于任何元素之上
@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.FIELD)
public @interface MyAnnotation  {
    /*String value() default "";
    String name() default "";*/
}
