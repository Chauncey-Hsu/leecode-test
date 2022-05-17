package com.chuanqi.leetcode.codetop1.d215;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 * <p>
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * <p>
 * <p>
 * 实际考察的是排序算法。
 *
 * @author xuchuanqi
 * @date 2022/4/22 20:47.
 */
public class FindKthLargest {

    public static void main(String[] args) {
    }


}

/**
 * 快速排序
 */
class Solution2 {
    public int findKthLargest(int[] nums, int k) {

        return 0;
    }
}
/**
 * 对方法一的优化
 * 选择排序
 */
class Solution1 {
    public int findKthLargest(int[] nums, int k) {

        return 0;
    }
}

/**
 调用类库的局限性。
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // 默认是升序
//        Arrays.sort(nums);

        // 同样因为int不是Integer，不能通过编译。
//        Arrays.sort(nums, Collections.reverseOrder());

        // 基本数据类型不能作为泛型。
        /*Arrays.sort(nums, new Comparator<int>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });*/


        // 运算符 '>' 不能应用于 'T'、'T'
//        Arrays.sort(nums, (i1, i2) -> {
//            return i1 > i2 ? -1 : 1;
//        });

        //转换

        // 没有这种用法longStream.sorted(Long::compareTo);
//        LongStream longStream = Arrays.stream(nums).asLongStream();
//        longStream.sorted(Long::compareTo);

        // 没有这种用法 longStream.collect(Collectors.toList());
//        LongStream longStream = Arrays.stream(nums).asLongStream();
//        longStream.collect(Collectors.toList());


        // 还是因为int类型，不能转换。如果是Integer就能转换。
//        List<int[]> ints = Arrays.asList(nums);
        // 如果是Integer就能转换。
//        List<Integer> integers = Arrays.asList(12, 23, 32, 23);

        // // 还是因为int类型，不能转换。
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, nums);
//        list.sort((o1,o2)->{
//            return o2.compareTo(o1);
//        });

        // 这是最简单的，
        Arrays.sort(nums);
        return nums[nums.length - k];


    }
}