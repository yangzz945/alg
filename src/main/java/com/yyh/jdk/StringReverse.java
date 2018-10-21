package com.yyh.jdk;
/*     
 created by yangzhizhong at 2018/10/16   
 */

public class StringReverse {

    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length()-1;i>=0;i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public static  void main(String[] args) {
        System.out.println(reverse("A man, a plan, a canal: Panama"));

        System.out.println(reverseInt(-123));

        System.out.println(reverseInt(123));

        System.out.println(reverseInt(1200));
    }

    public static int reverseInt(int input) {
        boolean isNeg = false;
        int realInput = input;
        if (input<0) {
            isNeg = true;
            realInput = -input;
        }

        String str = String.valueOf(realInput);
        String revStr = reverse(str);

        int result = Integer.parseInt(revStr);

        if (isNeg) {
            result = -result;
        }
        return result;

    }
}
