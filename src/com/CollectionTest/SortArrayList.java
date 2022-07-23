package com.CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SortArrayList {

	public static void main(String[] args) {

		// creating a list of fruilts

		List<String> list1 = new ArrayList<>();

		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");

		// sorting the list

		Collections.sort(list1);

		// Tranversing list through the for-each loop

		for (String fruit : list1)

			System.out.println(fruit);

		System.out.println("Sorting numbers...");

		// Creating a list of numbers

		List<Integer> list2 = new ArrayList<Integer>();

		list2.add(21);
		list2.add(22);
		list2.add(23);
		list2.add(24);

		// sorting the list2

		Collections.sort(list2);

		// transversing list2 through the for-each loop

		for (Integer number : list2)

			System.out.println(number);

		

	}

}
