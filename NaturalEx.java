package com.corejava.flowcontrols;

import java.util.Scanner;

public class NaturalEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // print the fisrt n natural numbers
		System.out.println("Enter a number : ");
		int number = scan.nextInt();
		for(int i = 1;i <= number; i++) {
			System.out.println(i);
		}
	}

}
