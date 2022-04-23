package com.chuanqi.leetcode.bishi.jianshe;

public class Main {

    public static void main(String[] args) {
        int[] number = new int[]{6, 3, 4, 9, 10, 7, 10, 2, 6};
        System.out.println(getPosition(9, 6, number));
    }

    public static int getPosition(int m, int k, int[] number) {
        // write code here
        int maxIdx = -1;
        if (number == null) {
            return maxIdx;
        }
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
            if (sum % m == k) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
