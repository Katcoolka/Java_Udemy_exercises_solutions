package com.udemy.exercise33.carpet.cost.calculator;

public class Carpet {

	// instance variable:
	private double cost;

	// constructor:
	public Carpet(double cost) {
		this.cost = cost;
	}

	// getter and setter:
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		if (cost < 0) {
			this.cost = 0;
		} else {
			this.cost = cost;
		}
	}

}

/*
 * 2. Write a class with the name Carpet. The class needs one field (instance
 * variable) with name cost of type double.
 * 
 * The class needs to have one constructor with parameter cost of type double
 * and it needs to initialize the field.
 * 
 * In case the cost parameter is less than 0 it needs to set the cost field
 * value to 0.
 * 
 * Write the following methods (instance methods):
 * 
 * Method named getCost without any parameters, it needs to return the value of
 * cost field
 */
