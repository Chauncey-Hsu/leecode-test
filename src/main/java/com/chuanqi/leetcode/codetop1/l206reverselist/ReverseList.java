package com.chuanqi.leetcode.codetop1.l206reverselist;

/**
 * 1.206. 反转链表
 *
 * @author xuchuanqi
 * @date 2022/1/11 13:20.
 */
public class ReverseList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode listNode = solution.reverseList(node);
        System.out.println(listNode.val);
    }
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/** 官方的更优秀。 时间复杂度：O(n)
 * class Solution {
 *     public ListNode reverseList(ListNode head) {
 *         ListNode prev = null;
 *         ListNode curr = head;
 *         while (curr != null) {
 *             ListNode next = curr.next;
 *             curr.next = prev;
 *             prev = curr;
 *             curr = next;
 *         }
 *         return prev;
 *     }
 * }
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list/solution/fan-zhuan-lian-biao-by-leetcode-solution-d1k2/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode head1 = head;
        ListNode head2 = null;
        while (head != null) {
            // 总结3，head的前后两个都先独立出来，不然，赋值next = null的时候，会影响到。
            ListNode next = head.next;
            head1 = head;
            head1.next = null;

            head1.next = head2;
            head2 = head1;

            head = next;
        }
        return head2;
    }
}

class Solution2 {
    // 总结2，写法是对的，但是不对题，写成了依次将头部的代码变为尾部的代码，但是顺序没有变。
    public ListNode reverseList(ListNode head) {
        ListNode tail = null;
        ListNode headNode = head;

        while (head.next != null) {
            head = head.next;
        }
        tail = head;
        ListNode tailNode = tail;


        ListNode a = headNode, b = tailNode;
        while (headNode != tailNode) {
            a = headNode;
            headNode = headNode.next;
            a.next = null;

            b.next = a;
            b = a;
        }


        return headNode;
    }
}


class Solution1 {
    public ListNode reverseList(ListNode head) {
        // 总结1，对于链表的反转，由于引用的唯一性，clone的不建议使用，所以不能用同一个引用在两个链表上同时操作。，
        ListNode newList = head;
        while (head.next != null) {
            // 第一条链
//            head;
            ListNode temp = head.next;

            //
            newList = temp;
            newList.next = head;

            head = temp;

        }

        return newList;
    }
}