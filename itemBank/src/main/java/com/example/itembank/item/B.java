package com.example.itembank.item;

public class B {
    //输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
    //
    //要求时间复杂度为O(n)。
    //
    // 
    //
    //示例1:
    //
    //输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //输出: 6
    //解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        //1.状态，即子问题。
        //dp[i] 代表以元素 nums[i] 为结尾的连续子数组最大和。
        //
        //2.转移策略，自带剪枝。
        //若 dp[i−1]≤0 ，说明 dp[i−1] 对 dp[i] 产生负贡献，即 dp[i−1]+nums[i] 还不如 nums[i] 本身大。
        //
        //3.状态转移方程，根据前两步抽象而来。
        //
        //当 dp[i−1]>0 时：执行 dp[i] = dp[i-1] + nums[i]；
        //当 dp[i−1]≤0 时：执行 dp[i] = nums[i] ；
        int dp = nums[0];
        int max = dp;
        for (int i = 1; i < nums.length; i++) {
            dp = Math.max(dp + nums[i], nums[i]);
            max = Math.max(max, dp);
        }
        return max;
    }
}
