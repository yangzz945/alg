package com.yyh.jdk;

import java.net.URLEncoder;
import java.util.UUID;

/**
 * Created by youku on 2018/5/4.
 */
public class UUIDTest {

    public static void main(String[] args) {

        String str = UUID.randomUUID().toString();

        System.out.println(str);
        UUID uuid = UUID.fromString(str);

        //System.out.print(uuid.timestamp());

        String str1 = "历史";
        try {
            String strEncode1 = URLEncoder.encode(str1, "UTF-8");
            System.out.println(strEncode1);
        } catch (Exception ex) {

        }

        try {
            String utf8Str = new String(str1.getBytes("UTF-8"), "UTF-8");
            System.out.print(utf8Str);
        } catch (Exception ex) {

        }


    }
}
