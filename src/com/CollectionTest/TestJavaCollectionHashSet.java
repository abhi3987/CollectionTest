package com.CollectionTest;

import java.util.HashSet;
import java.util.Iterator;

public class TestJavaCollectionHashSet {

	public static void main(String[] args) {
		HashSet<String> set= new HashSet<String>();
		set.add("Abhi");
		set.add("Amar");
		set.add("Avinash");
		set.add("Amit");
		set.add("Akash");
		
		Iterator itr = set.iterator();
		while(itr.hasNext());
		System.out.println(itr.next());
		

	}

}
