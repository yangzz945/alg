package com.yyh.jdk;
/*     
 created by yangzhizhong at 2018/12/18   
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatrixUtil {

    public static int dotProduct(int[] a,int[] b) {

        // scalar s = sum(a*b)

        //int[] a = new int[SIZE];
        //int[] b = new int[SIZE];

        //Arrays.fill(a, 10);
       // Arrays.fill(b, 20);

        int result = IntStream.range(0, a.length)
                .parallel()
                .map( id -> a[id] * b[id])
                .reduce(0, Integer::sum);

        //System.out.println(result);
        return result;
    }

    public static int dotProductStand(int[] a,int[] b) {

        // scalar s = sum(a*b)

        //int[] a = new int[SIZE];
        //int[] b = new int[SIZE];

        //Arrays.fill(a, 10);
        // Arrays.fill(b, 20);

        int size = a.length;
        int sum = 0;
        for (int i = 0;i<size;i++) {
            sum+=a[i]*b[i];
        }

        return sum;
        //System.out.println(sum);
    }

    public static void main(String[] args) {
        int SIZE =100;
        int[] a = new int[SIZE];
        int[] b = new int[SIZE];

        Arrays.fill(a, 10);
        Arrays.fill(b, 10);

         long start = System.currentTimeMillis();
         for (int i=0;i<1000;i++) {
             MatrixUtil.dotProduct(a,b);
         }
         System.out.println("cost:"+(System.currentTimeMillis()-start));

         start = System.currentTimeMillis();
        for (int i=0;i<1000;i++) {
            MatrixUtil.dotProductStand(a,b);
        }
        System.out.println("cost:"+(System.currentTimeMillis()-start));


    }


}
