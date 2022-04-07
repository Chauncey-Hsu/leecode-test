package com.chuanqi.leetcode.codetop1.l003;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;

/**
 * 3. 无重复字符的最长子串
 *  官方的解答也是O(n)，两个指针，两个循环嵌套，但是减少了新变量的维护。较好。
 *
 * @author xuchuanqi
 * @date 2022/1/13 11:18.
 */
public class LongestSubstringOfNoRepeat {
}

class SolutionA {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
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

    public boolean isSub(byte aByte, HashSet<Byte> subSet ){
        if (subSet.contains(aByte)) {
            return true;
        }
        return false;
    }
}