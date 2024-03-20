package com.jspider.practice.HackerRank;

import java.util.ArrayList;

//Input: nums = [0,1,0,3,12]
//Output: [0,0,1,3,12,]

public class MoveZeroToLeft {
public static void main(String[] args) {
	int nums[]= {0,1,0,3,13};
	ArrayList<Integer> zero = new ArrayList<>();
	ArrayList<Integer> nonzero = new ArrayList<>();
	for(Integer i:nums) {
		if(i==0) {
			zero.add(i);
		}
		else {
			nonzero.add(i);
		}
	}
	zero.addAll(nonzero);
	System.out.println(zero);
}
}
