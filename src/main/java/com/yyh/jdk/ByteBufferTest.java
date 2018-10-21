package com.yyh.jdk;
/*     
 created by yangzhizhong at 2018/10/15   
 */

import java.nio.ByteBuffer;

public class ByteBufferTest {

    public static void main(String[] args) {
        ByteBuffer directBuffer = ByteBuffer.allocate(1024);
        directBuffer.putLong(8);
        System.out.println(directBuffer.array().length);
    }
}
