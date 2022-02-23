package com.companywages;

public class EmployeeWages {
	public static void empdata(int fulltime, int parttime) {
		final int wagesperhrs = 20;
		int empHrs = 0;
		// number for 0 for absent 1 for present
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;

		// if condition to check employee is working full time, part time or absent
		if (empCheck == fulltime)
			empHrs = 16;
		else if (empCheck == parttime)
			empHrs = 8;
		else
			empHrs = 0;
		// Daily Wages
		int dailywages = wagesperhrs * empHrs;
		System.out.println("Employee Wage is " + dailywages);

	}

	public static void main(String[] args) {
		int parttime = 1, fulltime = 2;

		// declaring constants
		empdata(parttime, fulltime);

	}

}
