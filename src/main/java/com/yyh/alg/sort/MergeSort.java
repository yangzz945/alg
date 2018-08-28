package com.yyh.alg.sort;

/**
 * Created by youku on 2018/4/11.
 */
public class MergeSort {


    public void sort(int a[],int low,int high) {

        if (low<high) {
            int mid = (low+high)/2;
            sort(a,low,mid);
            sort(a,mid+1,high);

            merge(a,low,mid,high);
        }
    }

    public static void merge(int a[],int low,int mid,int high) {

    }

    public static void main(String[] args) {

    }
}
