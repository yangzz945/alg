package com.yyh.jdk;

import com.google.common.collect.Lists;
import com.yyh.jdk.pojo.Config;

import java.util.List;

/**
 * 描述:
 * TestArrayList
 * com.yyh.jdk.TestArrayList
 *
 * @author yangzhizhong
 * @date 2018/8/21
 * <p>
 * config_start:
 * |com.yyh.jdk.TestArrayList|TestArrayList|yangzhizhong|
 * config_end:
 */
public class TestArrayList {

    public static void main(String[] args) {
        List<Config> configList = Lists.newArrayList();
        configList.add(new Config(1,"1"));
        configList.add(new Config(2,"2"));

        System.out.println(configList);

        List<Config> copyConfigList = Lists.newArrayList(configList);
        copyConfigList.get(0).setName("10");

        System.out.println(configList);
        System.out.println(copyConfigList);

    }
}
