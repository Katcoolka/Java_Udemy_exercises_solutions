package com.udemy.exercise39.polymorphism;

public class Holden extends Car {

	// sub-class of Car with no member variables.
	// the constructor for each will call the parent constructor for the object
	// instantiation.
	// this class will override the 3paren methods startEngine, accelerate, and
	// brake.
	// the return messages for these methods should somewhere contain the name of
	// the class to which the methods belong.

	public Holden(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		// another way how to call the name of the class we are in
		return getClass().getSimpleName() + " -> startEngine()";
	}

	@Override
	public String accelerate() {

		return getClass().getSimpleName() + " -> accelerate()";
	}

	@Override
	public String brake() {

		return getClass().getSimpleName() + " -> brake()";
	}
}
