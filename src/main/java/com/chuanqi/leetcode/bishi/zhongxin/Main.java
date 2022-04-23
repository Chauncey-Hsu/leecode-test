package com.chuanqi.leetcode.bishi.zhongxin;


import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('A', 'a');
        map.put('E', 'e');
        map.put('I', 'i');
        map.put('O', 'o');
        map.put('U', 'u');
        str = str.toUpperCase();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Character character = map.get(chars[i]);
            if (character != null){
                chars[i] = character;
            }
        }
        System.out.println(String.valueOf(chars));
    }
}
