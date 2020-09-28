package com.mangxiao.leetcode.array.subject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-insert-position
 */
public class SearchInsertSolution {
    private static Log log = LogFactory.getLog(SearchInsertSolution.class);

    public int searchInsert(int[] nums, int target,String flag) {
        flag = "myself";
        int result = -1;
        for (int i=0; i<nums.length; i++){
            if(target == nums[i]){
                result = i;
            }
        }
        if(result == -1){
            if (target > nums[nums.length - 1]){
                result = nums.length;
            }else{
                for (int j=0; j<nums.length; j++){
                    if(nums[j] >= target){
                        result = j;
                        break;
                    }
                }
            }

        }
        return result;
    }

    /**
     * LEETCODE
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target){
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }


    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        SearchInsertSolution sis = new SearchInsertSolution();
        int r1 = sis.searchInsert(nums, 5);
        log.info("r1:" + r1);
        int r2 = sis.searchInsert(nums, 2);
        log.info("r2:" + r2);
        int r3 = sis.searchInsert(nums, 7);
        log.info("r3:" + r3);
        int r4 = sis.searchInsert(nums, 0);
        log.info("r4:" + r4);


    }
}
