package com.jspider.practice.HackerRank;

import com.jspider.practice.imp.Arrays;

//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        
        System.out.print("Merged Array: [");
        for (int l = 0; l < nums1.length; l++) {
            if (l != nums1.length - 1) {
                System.out.print(nums1[l] + ", ");
            } else {
                System.out.print(nums1[l]);
            }
        }
        System.out.println("]");
        }
      

}
