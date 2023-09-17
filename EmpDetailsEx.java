package com.corejava.flowcontrols;

import java.util.Scanner;

public class EmpDetailsEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // emp details from the scanner class
		System.out.println("Enter Employee Id : ");
		System.out.println("Enter Employee Name : ");
		System.out.println("Enter Employee Salary : ");
		System.out.println("Enter Employee EmpAddress : ");
		System.out.println("Enter Employee ContactNo : ");
		System.out.println("Enter Employee Gender : ");
		int empId = scan.nextInt();
		String empName = scan.next();
		float empSalary = scan.nextFloat();
		String empAddress = scan.next();
		long contactNo = scan.nextLong();
		char gender = scan.next().charAt(0);

		System.out.println("Enter Employee Id :  " + empId);
		System.out.println("Enter Employee Name : " + empName);
		System.out.println("Enter Employee Salary : " + empSalary);
		System.out.println("Enter Employee EmpAddress : " + empAddress);
		System.out.println("Enter Employee ContactNo : " + contactNo);
		System.out.println("Enter Employee Gender : " + gender);
	}

}
