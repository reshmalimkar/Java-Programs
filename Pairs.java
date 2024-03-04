package com.info.functionalInterface.mock;

public class Pairs {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int p=5;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==p) {
					System.out.println("["+arr[i] + "," + arr[j]+"] ");
				}
				
			}
		}
		
		
		
	}

}
