package com.CollectionTest;

import java.util.Iterator;
import java.util.Vector;

public class TestCollectionTestVector {

	public static void main(String[] args) {
		Vector<String> v= new Vector<>();
		
		v.add("Abhi");
		v.add("Amar");
		v.add("Avinash");
		v.add("Sunil");
		
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
