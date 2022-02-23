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
		int dailywages = 0;
		int monthlyWage = 0;

		// looping for n working days
		int totalempHrs = 0;
		int totalworkingdays = 0;
		int workinghours = 100;
		// number for 0 for absent 1 for present
		empCheck = getRandomNumber();


		while (totalempHrs <= workinghours && totalworkingdays <= workingday) {
			int empHrs = 0;
			totalworkingdays++;

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
			// Calculating Daily Wages, Monthly Wages of employee

			dailywages = wagesperhrs * empHrs;
			monthlyWage = monthlyWage + dailywages;
			// Total Hour calculation
			totalempHrs = totalempHrs + empHrs;
		}
		System.out.println("Employee dailywages is " + dailywages + ", Monthly wages is " + monthlyWage
				+ " and Total Hours is " + totalempHrs);

	}

	public static void main(String[] args) {
		int empCheck = 0;
		getRandomNumber();
		// declaring constants
		empinfo(empCheck);
	}

}
