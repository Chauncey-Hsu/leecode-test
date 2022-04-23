package com.chuanqi.leetcode.bishi.zhongxin;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean prekOdd = false;
        int num = 0;

        for (int i = 0; i < n; i++) {
            int i1 = scanner.nextInt();
            boolean curOdd = (i1 % 2) != 0;
            if (prekOdd && curOdd) {
                // 如果前一个和当前的数字为奇数，则增加一。
                num++;
            }
            prekOdd = curOdd;
        }
        System.out.println(num);
    }
}
