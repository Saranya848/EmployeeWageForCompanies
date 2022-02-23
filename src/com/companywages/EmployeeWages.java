package com.companywages;

class Wages {

	public void empdetails(String CompanyName, int wagesperhrs, int workinghours, int workingday) {
		int dailywages = 0;
		int monthlyWage = 0;
		// looping for n working days
		int totalempHrs = 0, totalWage = 0;
		int totalworkingdays = 0;

		while (totalempHrs <= workinghours && totalworkingdays <= workingday) {
			int empHrs = 0;
			totalworkingdays++;
			// Generate random number for 0 for absent 1 for present
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
			System.out.println("Working Hours: " + totalworkingdays);
			System.out.println("Employee Hours : " + totalempHrs);
			// calculating Total Salary
			totalWage = totalempHrs * wagesperhrs;
		}
		System.out.println("Total Employee Wage for Company " + CompanyName + "  is  " + totalWage);
	}

}

public class EmployeeWages {

	public static void main(String[] args) {
		// declaring constants
		Wages w = new Wages();
		w.empdetails("CMR", 60, 2, 10);
		w.empdetails("GMR", 120, 8, 30);
		w.empdetails("SVR_Jew", 30, 8, 30);
		w.empdetails("Dmart", 20, 2, 10);
	}
}
