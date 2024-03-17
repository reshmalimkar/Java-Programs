package com.jspider.practice;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vowel");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("vowel " +ch);
		}else {
			System.out.println(ch + " is consonant");
		}
	}

}
