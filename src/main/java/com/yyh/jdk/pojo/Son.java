package com.yyh.jdk.pojo;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.reflect.FieldUtils;

/**
 * Created by youku on 2018/7/17.
 */
public class Son extends Father {

    public static void main(String[] args) throws  Exception {
        //BeanUtils.
        Father son = new Son();
        son.setUtdid("123");
        System.out.println(BeanUtils.getProperty(son,"utdid"));
        System.out.println(FieldUtils.readDeclaredField(son,"utdid",true));
    }
}
