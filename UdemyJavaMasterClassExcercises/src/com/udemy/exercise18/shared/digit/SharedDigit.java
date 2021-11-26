package com.udemy.exercise18.shared.digit;

public class SharedDigit {

	public static void main(String[] args) {
		System.out.println("the numbers 12, 23 share same number " + hasSharedDigit(12, 23));
		System.out.println("the numbers 9, 99 share same number " + hasSharedDigit(9, 99));
		System.out.println("the numbers 15, 55 share same number " + hasSharedDigit(15, 55));
		System.out.println("the numbers 18, 43 share same number " + hasSharedDigit(18, 43));

	}

	public static boolean hasSharedDigit(int firstNum, int secondNum) {

		if ((firstNum < 10) || (firstNum > 99) || (secondNum < 10) || (secondNum > 99)) {
			return false;
		}

		int a = firstNum % 10;
		int b = secondNum % 10;

		firstNum /= 10;
		secondNum /= 10;

		return ((firstNum == secondNum) || (firstNum == b) || (a == secondNum) || (a == b));

	}

}

/*Write a method named hasSharedDigit with two parameters of type int. 

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.


EXAMPLE INPUT/OUTPUT:

* hasSharedDigit(12, 23); -> should return true since the digit 2 appears in both numbers

* hasSharedDigit(9, 99); -> should return false since 9 is not within the range of 10-99

* hasSharedDigit(15, 55); -> should return true since the digit 5 appears in both numbers


NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.*/
