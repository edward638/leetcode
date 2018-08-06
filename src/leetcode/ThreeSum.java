package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//
//        Note:
//
//        The solution set must not contain duplicate triplets.
//
//        Example:
//
//        Given array nums = [-1, 0, 1, 2, -1, -4],
//
//        A solution set is:
//        [
//        [-1, 0, 1],
//        [-1, -1, 2]
//        ]

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int x = 0; x < nums.length - 2; x++){
            int target = -nums[x];
            int left = x + 1;
            int right = nums.length - 1;
            if (!(x > 0 && nums[x] == nums[x-1])) {
                while (left < right) {
                    if ((nums[left] + nums[right]) == target) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[x]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        list.add(temp);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left-1]) left++;
                        while (left < right && nums[right] == nums[right+1]) right--;
                    } else if ((nums[left] + nums[right]) > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return list;

    }
}
