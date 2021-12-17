package com.udemy.exercise40.oop.bills.burger;

public class Hamburger {

	// four variables to represent the four basic ingredients of the hamburger
	private String name;
	private String meat;
	private String breadRollType;
	private double price;

	// separate variables for four(4) possible additions to the hamburger created
	// after a constructor is in place
	private String addition1Name;
	private double addition1Price;

	private String addition2Name;
	private double addition2Price;

	private String addition3Name;
	private double addition3Price;

	private String addition4Name;
	private double addition4Price;

	// the constructor will be needed to accept these four values as parameters when
	// creating a new hamburger
	public Hamburger(String name, String meat, String breadRollType, double price) {
		this.name = name;
		this.meat = meat;
		this.breadRollType = breadRollType;
		this.price = price;

	}

	// methods:
	public void addHamburgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}

	public void addHamburgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}

	public void addHamburgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}

	public void addHamburgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}

	public double itemizeHamburger() {
		double hamburgerPrice = this.price;
		System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll " + "with " + this.meat
				+ " price is " + this.price);
		if (this.addition1Name != null) {
			hamburgerPrice += this.addition1Price;
			System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
		}
		if (this.addition2Name != null) {
			hamburgerPrice += this.addition2Price;
			System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
		}
		if (this.addition3Name != null) {
			hamburgerPrice += this.addition3Price;
			System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
		}
		if (this.addition4Name != null) {
			hamburgerPrice += this.addition4Price;
			System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
		}

		return hamburgerPrice;
	}

}
/*
 * Five(5) methods are also needed inside the Hamburger class. Four(4) for
 * adding up to four additions to the hamburger and one(1) for printing out an
 * itemized listing of the final hamburger with addons, if any, and the total
 * price. Remember that a name and price must be accepted as parameters in the
 * first four methods so that the price of the hamburger is adjusted
 * accordingly. These methods should be named addHamburgerAddition1,
 * addHamburgerAddition2, addHamburgerAddition3, addHamburgerAddition4, and
 * itemizehamburger. The first four methods do not return values, but the last
 * method does return the total price of the hamburger of type double, which
 * includes the base price of the hamburger plus any additional items.
 */
