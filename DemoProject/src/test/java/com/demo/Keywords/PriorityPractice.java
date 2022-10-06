package com.demo.Keywords;

import org.testng.annotations.Test;

public class PriorityPractice {

	@Test(priority=1)
	public void a1() {
		System.out.println(" Method a1 is running");
	}
	
	@Test(priority=1)
	public void a2() {
		System.out.println(" Method a2 is running");
	}

	@Test(priority=1)
	public void a3() {
		System.out.println(" Method a2 is running");
	}

	@Test(priority=1)
	public void a4() {
		System.out.println(" Method a3 is running");
	}

	@Test(priority=1)
	public void a5() {
		System.out.println(" Method a5 is running");
	}

}
