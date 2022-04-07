package com.chuanqi.leetcode.grammer;

import org.junit.Test;

/**
 * @author xuchuanqi
 * @date 2022/2/27 19:57.
 */
public class Testttt {
    @Test
    public void test03() {
        int i;
        if (false || (i = 3) == 5) {
            System.out.println("jin");
        } else {
            System.out.println("232");
        }
    }

    @Test
    public void test02() {
        int i = 5 / 3;
        System.out.println(i);
        double j = Double.valueOf(5d / 3d);
        System.out.println(j);
    }

    @Test
    public void test01() {
        Integer integer = new Integer(1);
        System.out.println(integer == new Integer(1));

    }
}
