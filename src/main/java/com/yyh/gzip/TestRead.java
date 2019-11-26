package com.yyh.gzip;
/*     
 created by yangzhizhong at 2019/6/13   
 */

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringEscapeUtils;

import java.util.List;

public class TestRead {

    public static void main(String[] args) {

        try {
            List<String> lines = FileUtils.readLines(FileUtils.getFile("data/test_data.txt"));
            for (String str : lines) {
                String unescape = StringEscapeUtils.unescapeJava(str);
                JSONObject jsonObject = JSONObject.parseObject(unescape);
                System.out.println(jsonObject);

            }
            //System.out.println(lines);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
