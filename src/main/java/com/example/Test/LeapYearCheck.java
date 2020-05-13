package com.example.Test;

public class LeapYearCheck {

	public boolean isLeapYear(int year) {
		if (year > 0) {
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
		} else {
			return false;
		}

	}

//	public static void main(String[] args) {
//		LeapYearCheck leapYear = new LeapYearCheck();
//		System.out.println(leapYear.isLeapYear(0));
//	}

}
