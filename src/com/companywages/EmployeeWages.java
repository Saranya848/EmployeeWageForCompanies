package com.companywages;

public class EmployeeWages {
	public static int getRandomNumber() {
		// Generate random number for 0 for absent 1 for present
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		// System.out.println(empCheck);
		return empCheck;

	}

	public static void empinfo(int empCheck) {
		final int wagesperhrs = 120, workingday = 20;
		int empHrs = 0, dailywages = 0;
		int monthlyWage = 0;
		// number for 0 for absent 1 for present
		empCheck = getRandomNumber();
		// looping for n working days
		for (int day = 1; day <= workingday; day++) {
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
			// Calculating Daily Wages and Monthly Wages of employee
			dailywages = wagesperhrs * empHrs;
			monthlyWage = monthlyWage + dailywages;
		}
		System.out.println("Employee Wage daily is " + dailywages + " and Monthly Wage is " + monthlyWage);

	}

	public static void main(String[] args) {
		int empCheck = 0;
		getRandomNumber();
		// declaring constants
		empinfo(empCheck);
	}

}
