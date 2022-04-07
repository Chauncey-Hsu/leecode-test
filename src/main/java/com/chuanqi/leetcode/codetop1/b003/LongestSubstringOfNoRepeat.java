package com.chuanqi.leetcode.codetop1.b003;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 3. 无重复字符的最长子串
 * 官方的解答也是O(n)，两个指针，两个循环嵌套，但是减少了新变量的维护。较好。
 *
 * @author xuchuanqi
 * @date 2022/1/13 11:18.
 */
public class LongestSubstringOfNoRepeat {

    /**
     * 为什么会不一样？不都是字节码。
     * 因为字符串本身已经有了编码，并不是原始的字节。
     */
    @Test
    public void testttt() {
        byte[] bytes = "dsjlkfja你放好事非内地沙发了。。。".getBytes();
        byte[] bytes2 = "dsjlkfja你放好事非内地沙发了。。。".getBytes(StandardCharsets.UTF_8);
        byte[] bytes3 = "dsjlkfja你放好事非内地沙发了。。。".getBytes(StandardCharsets.ISO_8859_1);
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(bytes2));
        System.out.println(Arrays.toString(bytes3));
    }

    public static void main(String[] args) {
        SolutionB solution = new SolutionB();
        int num = solution.lengthOfLongestSubstring("adbcabdcbb");
        System.out.println(num);
    }
}

/**
 * 官方充分使用了散列，比我的set要更好。
 * 是正确的，但是不可能一下就想到这个方法。
 */
class SolutionB {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}

class SolutionA {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        byte[] bytes = s.getBytes();
        int lengthest = 0;
        // 时间复杂度为：O(n^2)
        HashSet<Byte> subSet = new HashSet<Byte>();
        for (int i = 0; i < bytes.length; i++) {
            byte aByte = bytes[i];
            boolean sub = isSub(aByte, subSet);

            // list 不行、set不行、那就String吧，

//            if ()
        }
        return 0;
    }

    public boolean isSub(byte aByte, HashSet<Byte> subSet) {
        if (subSet.contains(aByte)) {
            return true;
        }
        return false;
    }
}