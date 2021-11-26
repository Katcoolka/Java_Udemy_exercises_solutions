package com.udemy.exercise07.teen.number.checker;

public class Main {

	public static void main(String[] args) {

		boolean hasTeen = TeenNumberChecker.hasTeen(99, 2, 13);
		System.out.println(hasTeen);

		boolean isTeen = TeenNumberChecker.isTeen(15);
		System.out.println(isTeen);

	}

}
