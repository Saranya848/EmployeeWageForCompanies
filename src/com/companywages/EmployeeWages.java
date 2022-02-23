package com.companywages;

class Wages {
	public static int getRandomNumber() {
		// Generate random number for 0 for absent 1 for present
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		// System.out.println(empCheck);
		return empCheck;
	}

	public static void empdetails(int empCheck) {
		final int wagesperhrs = 120, workingday = 20;
		int dailywages = 0;
		int monthlyWage = 0;
		// looping for n working days
		int totalempHrs = 0, totalWage = 0;
		int totalworkingdays = 0;
		int workinghours = 100;

		while (totalempHrs <= workinghours && totalworkingdays <= workingday) {
			int empHrs = 0;
			totalworkingdays++;
			// number for 0 for absent 1 for present
			empCheck = getRandomNumber();
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
			System.out.println(totalempHrs);
			// calculating Total Salary
			totalWage = totalempHrs * wagesperhrs;
		}
		System.out.println("Employee dailywages is " + dailywages + ", Monthly wages is " + monthlyWage);
		System.out.println("Employee total Salary" + totalWage + " and total Hours is " + totalempHrs);
	}

}

public class EmployeeWages {

	public static void main(String[] args) {
		int empCheck = 0;

		// declaring constants
		Wages w = new Wages();
		w.getRandomNumber();
		w.empdetails(empCheck);
	}
}
