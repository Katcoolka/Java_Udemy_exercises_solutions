package com.udemy.exercise52.sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args) {

		HeavenlyBody temp = new Planet("Mercury", 88);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Venus", 225);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Earth", 365);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		HeavenlyBody tempMoon = new Moon("Moon", 27);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		temp = new Planet("Mars", 687);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		tempMoon = new Moon("Deimos", 1.3);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon); // temp is still Mars

		tempMoon = new Moon("Phobos", 0.3);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon); // temp is still Mars

		temp = new Planet("Jupiter", 4332);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		tempMoon = new Moon("Io", 1.8);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon); // temp is still Jupiter

		tempMoon = new Moon("Europa", 3.5);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon); // temp is still Jupiter

		tempMoon = new Moon("Ganymede", 7.1);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon); // temp is still Jupiter

		tempMoon = new Moon("Callisto", 16.7);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon); // temp is still Jupiter

		temp = new Planet("Saturn", 10759);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Uranus", 30660);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Neptune", 165);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Pluto", 248);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		System.out.println("Planets");

		for (HeavenlyBody planet : planets) {
			System.out.println("\t" + planet.getKey());
		}

		HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET));
		System.out.println("Moons of " + body.getKey());
		for (HeavenlyBody jupiterMoon : body.getSatellites()) {
			System.out.println("\t" + jupiterMoon.getKey());
		}

		Set<HeavenlyBody> moons = new HashSet<>();
		for (HeavenlyBody planet : planets) {
			moons.addAll(planet.getSatellites());
		}

		System.out.println("All Moons");
		for (HeavenlyBody moon : moons) {
			System.out.println("\t" + moon.getKey());
		}

		HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
		planets.add(pluto);

		for (HeavenlyBody planet : planets) {
			System.out.println(planet);
		}

		HeavenlyBody earth1 = new Planet("Earth", 365);
		HeavenlyBody earth2 = new Planet("Earth", 365);
		System.out.println(earth1.equals(earth2));
		System.out.println(earth2.equals(earth1));
		System.out.println(earth1.equals(pluto));
		System.out.println(pluto.equals(earth1));

		solarSystem.put(pluto.getKey(), pluto);
		System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
		System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));

		// Final check

		System.out.println();
		System.out.println("The solar system contains");
		for (HeavenlyBody heavenlyBody : solarSystem.values()) {
			System.out.println(heavenlyBody);
		}

	}
}
/*
 * Modify the previous HeavenlyBody example so that the HeavenlyBody class also
 * has a "bodyType" field. This field will store the type of HeavenlyBody
 * (PLANET, DWARF_PLANET, MOON).
 * 
 * For each of the three types that is supported, subclass the HeavenlyBody
 * class so that your program can create objects of the appropriate type.
 * 
 * There is a restriction that the only satellites that planets can have must be
 * moons.
 * 
 * Implement the following:
 * 
 * 1. HeavenlyBody (abstract)
 * 
 * - It has three private final fields. A Key called key, a double called
 * orbitalPeriod and a Set of type HeavenlyBody called satellites.
 * 
 * - A constructor that takes a String (name of the HeavenlyBody), a double (its
 * orbital period) and a BodyType. key is initialised with a new Key object and
 * satellites is initialised with a new HashSet.
 * 
 * - Eight methods:
 * 
 * - getOrbitalPeriod(), getter for orbitalPeriod.
 * 
 * - getKey(), getter for key.
 * 
 * - addSatellite(), it takes a HeavenlyBody as a parameter and returns true if
 * it was added successfully, false otherwise.
 * 
 * - getSatellites(), return a new HashSet populated with satellites.
 * 
 * - equals(), override method declared as public final. Two HeavenlyBody
 * objects are equal if their keys are equal.
 * 
 * - hashCode(), override method declared as public final. Return the hash code
 * of key.
 * 
 * - makeKey(), declared as public static and returns a new Key object.
 * 
 * - toString(), override method. Return the string representation as: name:
 * bodyType, orbitalPeriod.
 * 
 * - A nested enum named BodyTypes declared as public.
 * 
 * - And a nested class declared as public static final named Key.
 * 
 * 2. BodyTypes (nested enum)
 * 
 * - It has three constants: PLANET, DWARF_PLANET and MOON.
 * 
 * 3. Key (nested class)
 * 
 * - It has two fields. A String called name and a BodyTypes called bodyType.
 * 
 * - A constructor declared as private that takes a String and a BodyTypes and
 * initialises the fields with it.
 * 
 * - And five methods:
 * 
 * - getName(), getter for name.
 * 
 * - getBodyType(), getter for bodyType.
 * 
 * - equals(), override method. Two Key objects are equal if they have the same
 * name and bodyType.
 * 
 * - hashCode(), override method. Return the hash code for name, plus the hash
 * code for bodyType, plus an arbitrary number (random).
 * 
 * - toString(), override method. Return the string representation as: name:
 * bodyType.
 * 
 * 4. Planet
 * 
 * - A constructor that takes a String (name of the planet) and a double (its
 * orbital period) and calls its parent class with its arguments.
 * 
 * - And one method
 * 
 * - addSatellite(), override method. Add the satellite if its body type is a
 * moon.
 * 
 * 5. DwarfPlanet
 * 
 * - A constructor that takes a String (name of the dwarf planet) and a double
 * (its orbital period) and calls its parent class with its arguments.
 * 
 * 6. Moon
 * 
 * - A constructor that takes a String (name of the moon) and a double (its
 * orbital period) and calls its parent class with its arguments.
 * 
 * TIP: Be extremely careful with the spelling of the names of the fields,
 * constructors and methods.
 * 
 * TIP: Be extremely careful about spaces/spelling/format in the returned String
 * by toString().
 * 
 * NOTE: All fields are private (unless stated otherwise).
 * 
 * NOTE: All constructors are public (unless stated otherwise).
 * 
 * NOTE: All methods are public (unless stated otherwise).
 * 
 * NOTE: Do not add a main method to the solution code.
 */