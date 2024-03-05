package com.jspider.practice.HackerRank;

import java.util.Scanner;

//He is a very very good boy, isn't he?
public class JavaStringToken {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] words = s.split("[, .!?']+");
		System.out.println(words.length);
		for (int i = 0; i <= words.length - 1; i++) {
			System.out.println(words[i]);
		}

	}

}
