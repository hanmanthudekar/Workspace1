package com.demo.Keywords;

public class Test1 {

	public static void main(String[] args) {
		String str = "My name is amol";
		String words[]=str.split(" ");
		
		for(String s:words) {
			System.out.println(s+"="+s.length());
		}
	}
}
