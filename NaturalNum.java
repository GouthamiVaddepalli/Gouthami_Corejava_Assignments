package com.variables;

import java.util.Scanner;

public class NaturalNum {
	public int calculateSum(int n) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value");
		n = scan.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;

			}

		}
		return sum;

	}

	public static void main(String[] args) {

		NaturalNum obj = new NaturalNum();
		int n = 0;
		System.out.println(obj.calculateSum(n));

	}

}
