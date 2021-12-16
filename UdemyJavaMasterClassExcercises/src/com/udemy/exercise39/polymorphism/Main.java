package com.udemy.exercise39.polymorphism;

public class Main {

	public static void main(String[] args) {
		// test code for Car
		Car car = new Car(8, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());

		// test code for Mitsubishi
		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());

		// test code for Ford
		Ford ford = new Ford(6, "Ford Falcon");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());

		// test code for Holden
		Holden holden = new Holden(6, "Holden Commodore");
		System.out.println(holden.startEngine());
		System.out.println(holden.accelerate());
		System.out.println(holden.brake());

	}

}
