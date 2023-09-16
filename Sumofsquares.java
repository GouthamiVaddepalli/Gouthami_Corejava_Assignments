package com.variables;

import java.util.Scanner;

public class SumOfSquares {

	public static int calculateDifference(int n) {

		public static int calculateDifference(int n) {

		int sumOfSquares = 0;
		int sum = 0;

		int squareOfSum = 0;
		int squares;

		for (int i = 1; i <= n; i++) {
			squareOfSum = squareOfSum + i;
			sumOfSquares = i * i;
			sum = sum + sumOfSquares;
		}

		System.out.println("square of natural num : " + sum);

		System.out.println("sum of natural num : " + squareOfSum);
		squares = (squareOfSum) * (squareOfSum);
		System.out.println("square of sum : " + squares);
		int difference = sum - squares;
		return difference;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = scan.nextInt();
		System.out.println("Difference : " + calculateDifference(n));


	}

}
