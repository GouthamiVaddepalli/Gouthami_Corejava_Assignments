package com.variables;

import java.util.Scanner;

public class NaturalNum {
	public static int calculateSum(int n) {

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;

			}

		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = scan.nextInt();

		System.out.println(calculateSum(n));

	}

}
