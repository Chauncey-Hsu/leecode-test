package com.chuanqi.leetcode.codetop1;

/**
 * 请你设计并实现一个满足  LRU (最近最少使用) 缓存 约束的数据结构。
 * @author xuchuanqi
 * @date 2022/1/13 10:40.
 *
 * LeetCode的写法是，用Hashmap做存储与查找，然后使用双链表的node顺序作为最近未使用的顺序。 -- 需要练习一遍。
 * 如何存储最近使用的顺序呢？
 *  如果采用数组，就得遍历。方便存储
 *  如果采用HashMap，也需要遍历。方便存储
 *  如果用双链表，写入的代码与查询的代价都不算太高，都是O(1)，这才是好代码。
 *
 */
public class LRUCache {


    public LRUCache(int capacity) {

    }

    public int get(int key) {

        return -1;
    }

    public void put(int key, int value) {

    }
}
