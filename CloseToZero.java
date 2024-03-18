package com.jspider.practice;

//{-3, 4, 8, 2, -2, -8, 3, 7, -5}
public class CloseToZero {
	public static void main(String[] args) {
		int arr[]= {3, 4, 8, 2, 2, -8, 3, 7, -5};
		int curr=0;
		int near=arr[0];
		for(int i=0;i<arr.length;i++) {
			curr=arr[i]*arr[i];
			if(curr<=near*near) {
				near=arr[i];
			}
		}
		System.out.println(near);
	}

}
