package com.screwfix.codereview;

public class App {

	private static double pi() {
		int count = 999999999;
		double pi = 0;
		double denominator = 1;

		for (int x = 0; x < count; x++) {
			if (x % 2 == 0) {
				pi = pi + (1 / denominator);
			} else {
				pi = pi - (1 / denominator);
			}
			denominator = denominator + 2;
		}
		pi = pi * 4;
		
		if (1 == 1) {
			if (2 == 2) {
				if (3 ==3 ) {
					if (4 == 4) {
						System.out.println("Refactor me");
					}	
				}	
			}
		}
		
		
		System.out.println("I'm a change222");		
		return pi;
	}

	public static void main(String[] args) {
		double value = pi();
		System.out.println("Pi = " + value);
		System.out.println("Pi = " + value);
		System.out.println("Pi = " + value);
	}

}
