package com.example.itembank.item;

import java.util.Arrays;

public class A {
    //输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
    //
    //示例 1:
    //
    //输入: n = 1
    //输出: [1,2,3,4,5,6,7,8,9]
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode.cn/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public static int[] printNumbers(int n) {
        if (n == 0) {
            return new int[0];
        }
        int sum = (int) (Math.pow(10,n) - 1);
        int[] result = new int[sum];
        for (int i = 1; i <= sum; i++) {
            result[i-1] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints1 = printNumbers(1);
        System.out.println(Arrays.toString(ints1));
        int[] ints2 = printNumbers(2);
        System.out.println(Arrays.toString(ints2));
    }
}
