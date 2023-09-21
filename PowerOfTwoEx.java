package com.variables;

import java.util.Scanner;

public class PowerOfTwoEx {
	public static boolean power(int n) {

		int power = 0;
		int temp = 0;
		boolean result = false;

		while (temp < n) {
			temp = (int) Math.pow(2, power);
			power = power + 1;

		}
		
		if (temp == n) {
			result = true;
		} else {
			result = false;

		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = scan.nextInt();
		System.out.println(PowerOfTwoEx.power(n)); // calling static method

	}

}
