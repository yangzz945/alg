package com.yyh.jdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by youku on 2018/6/18.
 */
public class TestMerge {

    public static void main(String[] args) {
        List<String> EEList = new ArrayList<>();//Arrays.asList("1", "2", "3", "4", "5");//new ArrayList<>();//Lists.newArrayList();
        List<String> RTPList = Arrays.asList("6", "7", "8", "9", "10");

        int count = 10;
        List<String> finalResult = new ArrayList<>();
        for (int i = 0; i < EEList.size() || i * 2 < RTPList.size(); i++) {
            if (finalResult.size() < count) {
                if (i * 2 < RTPList.size()) {
                    finalResult.add(RTPList.get(i * 2));
                }
            } else {
                break;
            }
            if (finalResult.size() < count) {
                if (i * 2 + 1 < RTPList.size()) {
                    finalResult.add(RTPList.get(i * 2 + 1));
                }
            } else {
                break;
            }
            if (finalResult.size() < count) {
                if (i < EEList.size()) {
                    finalResult.add(EEList.get(i));
                }
            } else {
                break;

            }
        }
        System.out.println(finalResult);

    }
}