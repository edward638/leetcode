package leetcode;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int x = 0; x < nums.length; x++) {
            if (map.containsKey(nums[x])) {
                res[0] = map.get(nums[x]);
                res[1] = x;
                break;
            } else if (! map.containsKey(target - nums[x])){
                map.put(target-nums[x], x);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2 , 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums, target)[0] + " " +  twoSum(nums, target)[1]);
    }
}
