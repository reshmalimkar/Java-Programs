package com.jspider.practice.HackerRank;

import java.util.ArrayList;

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
public class TwoSumArray {
	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		ArrayList<String> ls = new ArrayList<String>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					// System.out.println("[" + i + ", " + j + "]");
					ls.add(i + ", " + j);
				}
			}
		}
		System.out.println(ls);

	}

}
