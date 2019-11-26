package com.yyh.gzip;
/*     
 created by yangzhizhong at 2019/6/6   
 */

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class TestGzip {

    public static void main(String[] args) {

        try {
            byte[] bytes= FileUtils.readFileToByteArray(FileUtils.getFile("data/gzip.txt"));

            //FileUtils.getFile("data/apns.txt");
            //FileUtils.
            //GZIPInputStream inputStream = new GZIPInputStream()
            File inputFile = FileUtils.getFile("data/gzip.txt");
            File outputFile = new File("data/apns-de.txt");
            GzipApache.decompressGZIP(inputFile,outputFile);

            List<String> strList = FileUtils.readLines(outputFile);
            System.out.println(strList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
