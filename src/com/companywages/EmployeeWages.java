package com.companywages;

public class EmployeeWages {
	public static int getRandomNumber() {
		//Generate random number for 0 for absent 1 for present
		int empCheck=(int)Math.floor(Math.random()*10) % 3;
		//System.out.println(empCheck);
		return empCheck;

	}
	public static void empdata(int empCheck) {
		final int wagesperhrs = 20;
		int empHrs = 0;
		// number for 0 for absent 1 for present
		empCheck=getRandomNumber();

		// Switch to check employee is working full time, part time or absent
		switch (empCheck) {
		case 0:
			empHrs = 0;// Employee absent
			break;
		case 1:
			empHrs = 4;// Employee Parttime present
			break;
		default:
			empHrs = 8;// Employee Fulltime present
			break;
		}
		// Calculating Daily Wages of employee
		int dailywages = wagesperhrs * empHrs;
		System.out.println("Employee Wage is " + dailywages);

	}

	public static void main(String[] args) {
		int empCheck=0;
		getRandomNumber();
		// declaring constants
		empdata(empCheck);
	}

}
