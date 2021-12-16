package com.udemy.exercise39.polymorphism;

public class Car {
//1. create class Car with 4 fields with private access
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

// 2. create Constructor for cylinder and name. set wheels to 4 and engine to true as default values.
	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;

	}

//3. create getters for cylinders and name with public access
	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}

//4. create 3 methods with public access:
	public String startEngine() {
		return "Car -> startEngine()";
	}

	public String accelerate() {
		return "Car -> accelerate()";
	}

	public String brake() {
		return "Car -> brake()";
	}

}
