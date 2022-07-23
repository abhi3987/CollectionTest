package com.CollectionTest;

import java.util.Iterator;
import java.util.TreeSet;

public class testJavaCollectionTreeSet {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();

		set.add("Abhi");
		set.add("Amar");
		set.add("Amit");
		set.add("Aman");
		set.add("Akash");

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
