package com.jspider.practice.HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if (a.length() != b.length()) {
			return false;
		}
		char[] charArray1 = a.toCharArray();
		char[] charArray2 = b.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		boolean anagram = isAnagram(a, b);
		System.out.println((anagram) ? "Anagrams" : "not Anagrams");

	}

}
