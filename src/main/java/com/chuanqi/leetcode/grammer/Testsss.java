package com.chuanqi.leetcode.grammer;

import java.util.Arrays;

public class Testsss {
    public static void main(String[] args) {

        String string = "pwwkew";
        System.out.println(lengthOfLongestSubstring(string));

        /*String[] strings = {"a", "c", "b"};
        Arrays.stream(strings).forEach(System.out::println);

        Arrays.sort(strings);
        Arrays.stream(strings).forEach(System.out::println);

        System.out.println("a".compareTo("b"));*/

    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }

        char[] chars = s.toCharArray();
        // 临时存放最大子串的长度
        int maxSize = 0;
        // 临时存放子字符串
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            int index = sb.toString().indexOf(chars[i]);
            if (index == -1) {
                sb.append(chars[i]);
                maxSize = Math.max(maxSize, sb.length());
            } else {
                sb = new StringBuilder(sb.substring(index + 1)).append(chars[i]);
            }
        }

        return maxSize;
    }

}
