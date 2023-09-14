package com.variables;

import java.util.Scanner;

public class Variables_Example {

	public static void main(String[] args) {

		// ------------------>using if else

//		int number1 = 12;
//		int number2 = 13;
//
//		if (number1 == number2) {
//			System.out.println("values are equal");
//		} else {
//			System.out.println("values are not equal");
//		}

//                  (or)

		// ---------------->using if condition
		// int number1 = 12;
		// int number2 = 13;

		// if (number1 != number2) {
		// System.out.println("values are not equal");
		// }

		// Eg:2

//		int number1 = 100;
//		int number2 = 100;
//
//		if (number1 == number2) {
//			System.out.println("values are equal");
//		}

// using scanner class

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number1 value");
		int number1 = scan.nextInt();
		System.out.println("Enter number2 value");
		int number2 = scan.nextInt();
		boolean result = (number1 == number2);
		if (result) {
			System.out.println("values are equal");
		} else {
			System.out.println("values are not equal");

		}
	}
}
