package com.udemy.exercise49.abstracct.classs;

public interface NodeList {
	ListItem getRoot();

	boolean addItem(ListItem item);

	boolean removeItem(ListItem item);

	void traverse(ListItem root);
}
