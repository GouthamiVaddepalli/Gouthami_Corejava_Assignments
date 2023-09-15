package com.variables;

import java.util.Scanner;

public class Sumofsquares {

	public int calculateDifference(int num) {

		int sumofsquares = 0;
		int squareofsum = 0;
		int sum = 0;

		int squares;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			squareofsum = squareofsum + i;
			sumofsquares = i * i;
			sum = sum + sumofsquares;
		}

		System.out.println(sum);

		System.out.println(squareofsum);
		squares = (squareofsum) * (squareofsum);
		System.out.println(squares);
		int difference = sum - squares;
		return difference;
	}

	public static void main(String[] args) {

		Sumofsquares obj = new Sumofsquares();
		int num = 0;
		System.out.println(obj.calculateDifference(num));

	}

}
