package com.jspider.imp;

import java.util.Scanner;

public class ArmgstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//153
		int temp=n,sumOfNumber=0;
		int r;
		while(n>0) {
			r=n%10;//3
			n=n/10;
			sumOfNumber+=(r*r*r);
			
			}
		if(temp==sumOfNumber) {
			System.out.println("Armgstrong Number");
		}
		else {
			System.out.println("not armgstrong number");
		}
		
	}

}
