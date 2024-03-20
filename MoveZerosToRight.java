package com.jspider.practice.HackerRank;

import java.util.ArrayList;

//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
		
public class MoveZerosToRight {
public static void main(String[] args) {
	int nums[]= {0,1,0,3,12};
	ArrayList<Integer> nonzero = new ArrayList<>();
	ArrayList<Integer> zero = new ArrayList<>();
	for(Integer i:nums) {
		if(i>0) {
		nonzero.add(i);
		}
		else {
			zero.add(i);
		}
		}
	nonzero.addAll(zero);
	System.out.println(nonzero);
//	System.out.println(zero);
}
}
