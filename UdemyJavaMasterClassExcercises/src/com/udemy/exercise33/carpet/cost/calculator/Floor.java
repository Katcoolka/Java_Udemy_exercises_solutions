package com.udemy.exercise33.carpet.cost.calculator;

public class Floor {

	// instance variables:
	private double width;
	private double lenght;

	// constructor:
	public Floor(double width, double lenght) {
		this.width = width;
		this.lenght = lenght;
	}

	// getters and setters:

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		if (lenght < 0) {
			this.lenght = 0;
		} else {
			this.lenght = lenght;
		}
	}

	// instance method

	public double getArea() {
		return (width * lenght);
	}

}

/*
 * 1. Write a class with the name Floor. The class needs two fields (instance
 * variables) with name width and length of type double.
 * 
 * The class needs to have one constructor with parameters width and length of
 * type double and it needs to initialize the fields.
 * 
 * In case the width parameter is less than 0 it needs to set the width field
 * value to 0, in case the length parameter is less than 0 it needs to set the
 * length field value to 0.
 * 
 * Write the following methods (instance methods):
 * 
 * Method named getArea without any parameters, it needs to return the
 * calculated area (width * length).
 */
