package com.yyh.classloader;
/*     
 created by yangzhizhong at 2020/5/13   
 */

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;

import java.sql.Connection;
import java.sql.DriverManager;

public class SpiTest {
    public static void main(String[] args) {

        try {
            //Class.forName("com.mysql.jdbc.Driver");
            //Connection con = DriverManager.getConnection(null,null,null);
            int l = Hashing.murmur3_32().newHasher().putString("mdd12345", Charsets.UTF_8).hash().asInt();
            System.out.println(l);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
