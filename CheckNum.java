package com.variables;

import java.util.Scanner;

public class CheckNum {
	public static boolean checkNumber(int number) {
		String s = String.valueOf(number);
		for (int i = 0; i <  s.length() - 1; i++) {
			if (s.charAt(i) <= s.charAt(i + 1)) {
				continue;

			} else {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num : ");
		int number = scan.nextInt();
		System.out.println("Increasing num : " + checkNumber(number));

	}

}
