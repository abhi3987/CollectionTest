package com.CollectionTest;

import java.util.Iterator;
import java.util.LinkedList;

public class TestJavaCollectionLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<>();
		
		list.add("Abhi");
		list.add("MAnu");
		list.add("Amar");
		list.add("Avinash");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
