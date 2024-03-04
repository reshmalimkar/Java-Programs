package com.info.functionalInterface.mock;

import java.util.HashMap;

public class OccuranceOfChar {
	public static void main(String[] args) {
		String s = "reshama limkar";

		char[] charArray = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i <= charArray.length - 1; i++) {
			if (map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i]) + 1);
			} else {
				map.put(charArray[i], 1);
			}
		}
		System.out.println(map);
	}

}
