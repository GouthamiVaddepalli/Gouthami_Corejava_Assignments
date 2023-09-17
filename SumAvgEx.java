package com.corejava.flowcontrols;

import java.util.Scanner;

public class SumAvgEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // using scanner class
		System.out.println("Enter num1 value : ");
		int sum;
		float avg;
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		sum = num1 + num2 + num3 + num4 + num5;
		avg = sum / 5;
		System.out.println(sum); // print the sum
		System.out.println(avg); // print the avg
	}
}
