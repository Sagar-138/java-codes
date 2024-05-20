package leetcode;

import java.util.HashMap;

class Solution {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		// fill
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		// searching
		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];
			int rem = target - n;
			if (map.containsKey(rem)) {
				int index = map.get(rem);
				if (index == i)
					continue;
				return new int[] { index, i };
			}
		}
		return new int[] {};
	}
}

public class Twosum {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = solution.twoSum(nums, target);
		System.out.println("{" + result[0] + "," + result[1] + "}");
	}
}
