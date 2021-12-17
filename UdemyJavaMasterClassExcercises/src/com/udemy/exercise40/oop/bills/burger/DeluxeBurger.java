package com.udemy.exercise40.oop.bills.burger;

public class DeluxeBurger extends Hamburger {

	// there are no additional member variables, and the constructor accepts no
	// parameters.
	// Instead, the constructor creates a deluxe burger with all the fixings and
	// chips and a drink for a base price of $19.10.
	// The constructor can be configured in any way, as long as chips and drink are
	// added for the total price just mentioned.

	public DeluxeBurger() {
		super("Deluxe", "Sausage & Bacon", "White", 14.54);
		super.addHamburgerAddition1("Chips", 2.75);
		super.addHamburgerAddition2("Drink", 1.81);

	}

	// the four(4) methods defined in the Hamburger class for including additional
	// toppings must each be overridden so that a message is printed stating that no
	// additional items can be added to a deluxe burger.

	@Override
	public void addHamburgerAddition1(String name, double price) {
		System.out.println("Cannot not add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("Cannot not add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("Cannot not add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println("Cannot not add additional items to a deluxe burger");
	}

}
