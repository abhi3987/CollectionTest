package com.CollectionTest;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Gaubha");
		al.add("pineapple");

		// accessing the element

		System.out.println("Returning element:" + al.get(1));// it will return because index starts from 0

		// changing the element

		al.set(1, "Dates");

		// Traversing list

		for (String fruit : al)
			System.out.println(fruit);

	}

}
