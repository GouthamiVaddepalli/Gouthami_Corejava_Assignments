package com.corejava.flowcontrols;

import java.util.Scanner;

public class GreatestNumEx {
	public static void main(String[] args) {
		int greatestNum = 0;
		Scanner scan = new Scanner(System.in); // using scanner class
		System.out.println("Enter num1 : ");
		System.out.println("Enter num2 : ");
		System.out.println("Enter num3 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if (num1 > num2 && num1 > num3) { 
			greatestNum = num1;
		} else if (num2 > num3 && num2 > num3) {
			greatestNum = num2;
		} else if (num3 > num1 && num3 > num1) {
			greatestNum = num3;
		}

		System.out.println(greatestNum); // print the greatestNum
	}
}
