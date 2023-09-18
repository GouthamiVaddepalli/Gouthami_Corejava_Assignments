package com.corejava.global;

public class Global {
	float empSalary = 500000.00f; // instance variable
	static String city = "Hyd"; // static variable
	
	public void displayMsg() {
		System.out.println("Hello Trainers");
	}
	public static int add(int a ,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		String name = "Gouthami";
		char gender = 'F'; // local variables
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);

		System.out.println(Global.city);
		Global obj = new Global();
		System.out.println(obj.empSalary);//accessing instance variable
		obj.displayMsg(); // calling instance method by using obj reference
		System.out.println(Global.add(10, 20)); // calling static method by using classname

	}
}
