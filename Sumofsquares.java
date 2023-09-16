package com.variables;

import java.util.Scanner;

public class Sumofsquares {

	public static int calculateDifference(int n) {

		public static int calculateDifference(int n) {

		int sumofsquares = 0;
		int sum = 0;

		int squareofsum = 0;
		int squares;

		for (int i = 1; i <= n; i++) {
			squareofsum = squareofsum + i;
			sumofsquares = i * i;
			sum = sum + sumofsquares;
		}

		System.out.println("square of natural num : " + sum);

		System.out.println("sum of natural num : " + squareofsum);
		squares = (squareofsum) * (squareofsum);
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
