package com.yyh.alg;

import java.util.Arrays;

/**
 * Created by yyh on 2018/3/21.
 */
public class BinarySearch {

    public static int binarySearch(int a[],int target) {
        int low = 0;
        int high = a.length-1;

        while(low<=high) {
            int mid = (low+high)/2;
            if (a[mid]==target) {
                return mid;
            } else if (a[mid]>target) {
                high = mid -1;
            } else {
                low = mid + 1 ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i=0;i<10;i++) {
            a[i]=i;
            System.out.println(a[i]);
        }


        System.out.println("find index:"+binarySearch(a,1));

    }
}
