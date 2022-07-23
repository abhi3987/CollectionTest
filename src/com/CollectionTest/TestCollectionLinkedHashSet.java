package com.CollectionTest;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestCollectionLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Abhi");
		set.add("Amar");
		set.add("Amit");
		set.add("Sunil");
		set.add("Vikash");
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
