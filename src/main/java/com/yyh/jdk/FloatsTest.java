package com.yyh.jdk;
/*     
 created by yangzhizhong at 2018/10/25   
 */

import com.google.common.collect.Lists;
import com.google.common.primitives.Floats;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FloatsTest {

    public static void main(String[] args) {
        float[][] floatList = new float[1000][64];
        int row = floatList.length;
        int col = 64;
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                floatList[i][j]=ThreadLocalRandom.current().nextFloat();
            }

        }
        //floatList.add(f2);
        long start =System.currentTimeMillis();
        for (int i=0;i<1000;i++) {
            float[] result = Floats.concat(floatList);

        }
        long cost = System.currentTimeMillis()-start;

        System.out.println(cost);
    }
}
