package com.yyh.alg;

/**
 * Created by youku on 2018/3/21.
 */
public class Sqrt {
    public static int sqrt(int n) {
        int low = 1;
        int high = n;

        while(low<=high) {
            int mid = (low+high)/2;
            int m = mid*mid;
            if (m == n) {
                return mid;
            } else if (m<n) {
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }

        int lowSum = low*low;
        int highSum = high*high;

        int lowGap = Math.abs(lowSum-n);
        int highGap = Math.abs(highSum-n);

        if (lowGap<highGap) {
            return low;
        } else {
            return high;
        }



    }
    public static void main(String[] args) {
        System.out.println(sqrt(4));
        System.out.println(sqrt(9));
        System.out.println(sqrt(10));
        System.out.println(sqrt(16));
        System.out.println(sqrt(25));
    }
}
