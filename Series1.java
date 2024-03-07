package com.info;

import java.util.Scanner;

//5,6,7,9,12,17,25,38,59,93,148,237,381,614,991
public class Series1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=4;
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(first+b + "  ");
		}
		
	}

}
