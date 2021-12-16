package com.udemy.exercise39.polymorphism;

public class Ford extends Car {

	// sub-class of Car with no member variables.
	// the constructor for each will call the parent constructor for the object
	// instantiation.
	// this class will override the 3paren methods startEngine, accelerate, and
	// brake.
	// the return messages for these methods should somewhere contain the name of
	// the class to which the methods belong.

	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "Ford -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Ford -> accelerate()";
	}

	@Override
	public String brake() {
		return "Ford -> brake()";
	}
}
