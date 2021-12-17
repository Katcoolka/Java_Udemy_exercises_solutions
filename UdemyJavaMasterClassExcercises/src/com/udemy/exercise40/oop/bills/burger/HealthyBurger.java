package com.udemy.exercise40.oop.bills.burger;

public class HealthyBurger extends Hamburger {

	// four(4) additional member variables:
	private String healthyExtra1Name;
	private double healthyExtra1Price;

	private String healthyExtra2Name;
	private double healthyExtra2Price;

	// The constructor for this class accepts two(2) parameters for meat and price.
	// Those are set in the constructor along with an appropriate name for the type
	// of burger.

	public HealthyBurger(String meat, double price) {
		super("Healthy", meat, "Brown rye", price);

	}

	// Two methods, addHealthyAddition1 and addHealthyAddition2 should be created
	// that each accept a name and price for the addition, allowing for up to two(2)
	// addons to the basic healthy burger.

	public void addHealthyAddition1(String name, double price) {
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = price;
	}

	public void addHealthyAddition2(String name, double price) {
		this.healthyExtra2Name = name;
		this.healthyExtra2Price = price;
	}

	// generate a message appropriate to the type of burger along with any addons.
	// The method also returns the total price of the healthy burger of type double.

	@Override
	public double itemizeHamburger() {

		double hamburgerPrice = super.itemizeHamburger();

		if (this.healthyExtra1Name != null) {
			hamburgerPrice += this.healthyExtra1Price;
			System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
		}

		if (this.healthyExtra2Name != null) {
			hamburgerPrice += this.healthyExtra2Price;
			System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
		}

		return hamburgerPrice;
	}

}