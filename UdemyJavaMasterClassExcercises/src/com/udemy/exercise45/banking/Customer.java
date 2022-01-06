package com.udemy.exercise45.banking;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions;

	public Customer(String name, double initialTransaction) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
		addTransaction(initialTransaction);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public void addTransaction(double transaction) {
		this.transactions.add(transaction);
	}

}
/*
 * 3. Customer
 * 
 * - It has two fields, A String called name and an ArrayList that holds objects
 * of type Double called transactions.
 * 
 * - A constructor that takes a String (name of customer) and a double (initial
 * transaction). It initialises name and instantiates transactions.
 * 
 * - And three methods, they are (their functions are in their names):
 * 
 * - getName(), getter for name.
 * 
 * - getTransactions(), getter for transactions.
 * 
 * - addTransaction(), has one parameter of type double (transaction) and
 * doesn't return anything.
 * 
 * 
 * TIP: In Customer, think about what else you need to do in the constructor
 * when you instantiate a Customer object.
 * 
 * TIP: Think about what methods you need to call from another class when
 * implementing a method.
 */