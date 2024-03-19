package com.jspider.Array;

public class SumOfFloatInArray {
	public static void main(String[] args) {
//		float [] marks= {49,66,87.2f,97.4f,98};
//		float sum = 0;
////	    for(int i=0;i<marks.length;i++) {
////	    	sum=sum+marks[i];
////	    }
//		for(float elements:marks) {
//			sum=sum+elements;
//		}
//	    System.out.println(sum);
//	}
	// Average of marks
	float [] marks= {49,66,87.2f,97.4f,98};
	float sum = 0;   
	for(float elements:marks) {
		sum=sum+elements;
	}
    System.out.println(sum/marks.length);
}

}
