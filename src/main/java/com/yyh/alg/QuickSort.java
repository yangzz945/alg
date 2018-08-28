package com.yyh.alg;

/**
 * Created by yyh on 2018/3/21.
 */
public class QuickSort {
    public static void QSort(int a[],int low,int high) {
        if (low>=high) {
            return ;
        }

        int pivot = findPivot(a,low,high);
        QSort(a,low,pivot-1);
        QSort(a,pivot+1,high);
    }

    public static int findPivot(int a[],int low,int high) {
        int key = a[low];
        while (low<high) {
            while(low<high&&a[high]>=key) {
                high--;
            }
            a[low]=a[high];

            while (low<high&&a[low]<=key) {
                low++;
            }
            a[high]=a[low];

        }
        a[low]=key;
        return low;
    }

    public static void main(String[] args) {
        int[] a={49,38,65,97,76,13,27,49};

        QSort(a,0,a.length-1);

        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
