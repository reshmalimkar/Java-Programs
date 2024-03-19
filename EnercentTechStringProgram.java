package com.jspider.practice;

import java.util.ArrayList;
import java.util.List;

// Output [[1,2],[3,4],[5,6]]

public class EnercentTechStringProgram {
	public static void main(String[] args) {
		String s = "1:2,3:4,5:6";
		String[] split = s.split(",");
		List<List<String>> l = new ArrayList<>();
		for (int i = 0; i < split.length; i++) {
			ArrayList<String> list = new ArrayList<>();
			list.add(split[i].replace(":", ","));
			l.add(list);
		}
		System.out.println(l);

	}
}