/*
 created by yangzhizhong at 2020/8/23   
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String A="123abcabc";
        String B="342adbceacb12";

        System.out.println(gettimes(A,B));

        for(int i=0;i<A.length();i++) {
            System.out.println(A.charAt(i));
        }
    }

    public static String gettimes(String A,String B ) {
        char[] chars = B.toCharArray();

        Map<Character,Integer> map = new LinkedHashMap<>();

        /*for(Map.Entry<Character,Integer> entry:map.entrySet()) {

        }*/

        for(Character ch:chars ) {
            Integer count = map.get(ch);
            if (null!=count) {
                count = count+1;
            } else {
                count=1;
            }
            map.put(ch,count);
        }

        StringBuilder retSb = new StringBuilder();
        char[] aChars = A.toCharArray();

        Set<Character> aHashSet = new HashSet<Character>();
        for(Character ch:aChars) {

            if (aHashSet.contains(ch)) {
                continue;
            }

            int chCount = 0;
            Integer count = map.get(ch);
            if (null!=count) {
                chCount = count;
            }

            retSb.append(ch).append(":").append(chCount).append(",");
            aHashSet.add(ch);
        }

        if (retSb.length()>=1) {
            retSb.deleteCharAt(retSb.length()-1);
        }
        return retSb.toString();
    }
}
