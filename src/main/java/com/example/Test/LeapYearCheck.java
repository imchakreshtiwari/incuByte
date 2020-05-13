package com.example.Test;

public class LeapYearCheck {

	public boolean isLeapYear(int year) {
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		} else if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYearCheck leapYear = new LeapYearCheck();
		int year = 2008;
		boolean res = leapYear.isLeapYear(year);
		System.out.println(res);
	}

}
