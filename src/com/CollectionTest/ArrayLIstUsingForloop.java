package com.CollectionTest;

import java.util.ArrayList;

public class ArrayLIstUsingForloop {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();// creating arraylist

		list.add("Abhi");// Adding object in arraylist
		list.add("Amit");
		list.add("Avinash");
		list.add("Aman");

		// traversing list through for-each loop

		for (String fruit : list)

			System.out.println(fruit);
	}

}
