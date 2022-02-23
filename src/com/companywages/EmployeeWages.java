package com.companywages;

public class EmployeeWages {
	public void empstatus() {

		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		// System.out.println(empCheck);

		// if condition to check employee is absent for 0
		if (empCheck == 0) {
			System.out.println("Employee is Absent");
		}

		// else condition to check employee is present for 1
		else
			System.out.println("Employee is Present");
	}

	public static void main(String[] args) {
		EmployeeWages ew = new EmployeeWages();
		// declaring constants
		ew.empstatus();

	}

}
