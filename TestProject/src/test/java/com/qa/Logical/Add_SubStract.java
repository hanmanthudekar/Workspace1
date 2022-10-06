package com.qa.Logical;

public class Add_SubStract {

	int a;
	int b;
	static int c;

	public int add(int a,int b) {
		c=a+b;
		return c;
	}


	public static void main(String[] args) {
		Add_SubStract as = new Add_SubStract();
		as.add(012, 30);
		System.out.println(c);
	}

}
