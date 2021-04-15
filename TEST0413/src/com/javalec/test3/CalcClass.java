package com.javalec.test3;

public class CalcClass {
	public static int SquareSum(int max) {
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			if (i % 2 == 1) {
				sum += i*i;
			} else if (i % 2 == 0) {
				sum += i*i*i;
			}
		}
		return sum;
	}

	public static String SquareSumExp(int max) {
		for (int i = 1; i <= max; i++) {
			if (i % 2 == 1) {
				System.out.print(i + "^2");

			} else if (i % 2 == 0) {
				System.out.print(i + "^3");
			}
			if (i % 2 == max) {
				break;
			} else if (i % 2 == 1 && i < max) {
				System.out.print(" - ");
			} else if (i % 2 == 0 && i < max) {
				System.out.print(" + ");
			}
		}
		return "";

	}
}
