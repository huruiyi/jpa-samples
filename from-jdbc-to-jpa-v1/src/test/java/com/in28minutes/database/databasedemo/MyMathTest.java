package com.in28minutes.database.databasedemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMathTest {

	private MyMath math = new MyMath();
	
	@Test
	void calculateSum_ThreeMemberArray() {		
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));
	}

	@Test
	void calculateSum_ZeroLengthArray() {		
		assertEquals(0, math.calculateSum(new int[] {}));
	}

	MyMath myMath = new MyMath();



	@Test
	public void sum_with3numbers() {
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
	}

	@Test
	public void sum_with1number() {
		System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] { 3 }));
	}

}
