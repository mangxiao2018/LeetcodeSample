package com.mangxiao.leetcode.array.subject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 1、两数之和
 * 给定一个整数数组 nums和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 */
public class TwoSumSolution {

    private static Log log = LogFactory.getLog(TwoSumSolution.class);

    /**
     * 两数之和主方法
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                int r = nums[i] + nums[j];
                if (r == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    /**
     * 打印
     * @param args
     */
    public void print(int[] args){
        log.info("---START-PRINT-----------------------------------");
        for (int i=0; i<args.length; i++){
            log.info("result["+ i +"]:" + args[i]);
        }
        log.info("---END-PRINT--------------------------------------");
    }

    public static void main(String[] args){
        //1.test-1~-------------------------
        int[] nums = {9,7,11,2};
        int target = 9;
        TwoSumSolution tss = new TwoSumSolution();
        int[] r = tss.twoSum(nums,target);
        tss.print(r);
        //2.test-2~------------------------
        int[] numsx = {3,3};
        int targetx = 6;
        TwoSumSolution tssx = new TwoSumSolution();
        int[] rx = tssx.twoSum(numsx,targetx);
        tss.print(rx);
    }

}
