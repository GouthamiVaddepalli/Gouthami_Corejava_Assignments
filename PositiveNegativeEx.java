package com.corejava.flowcontrols;

import java.util.Scanner;

public class PositiveNegativeEx {
	public static void main(String[] args) { // print the positive or negative
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		if (num > 0) {
			System.out.println("Number is Positive");
		} else {
			System.out.println("Number is Negative");
		}
	}

}
