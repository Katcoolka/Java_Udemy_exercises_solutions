package com.udemy.exercise38.encapsulation;

public class Main {

	public static void main(String[] args) {

		// Test input:

		Printer printer = new Printer(50, true);
		System.out.println("initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + " new total printcount for printer = "
				+ printer.getPagesPrinted());

		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed was " + pagesPrinted + " new total printcount for printer = "
				+ printer.getPagesPrinted());
	}

}
