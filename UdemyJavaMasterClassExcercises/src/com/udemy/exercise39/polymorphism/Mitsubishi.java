package com.udemy.exercise39.polymorphism;

public class Mitsubishi extends Car {

	// sub-class of Car with no member variables.
	// the constructor for each will call the parent constructor for the object
	// instantiation.
	// this class will override the 3paren methods startEngine, accelerate, and
	// brake.
	// the return messages for these methods should somewhere contain the name of
	// the class to which the methods belong.

	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "Mitsubishi -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Mitsubishi -> accelerate()";
	}

	@Override
	public String brake() {
		return "Mitsubishi -> brake()";
	}
}
