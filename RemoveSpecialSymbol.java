package com.jspider.imp;

public class RemoveSpecialSymbol {
	public static void main(String[] args) {
		String str="Abc@#";
		String replace = str.replaceAll("[^@]", "");
		System.out.println(replace);
	}

}
