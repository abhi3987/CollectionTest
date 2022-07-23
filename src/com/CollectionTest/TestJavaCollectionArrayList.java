package com.CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollectionArrayList {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<>();
		al.add("Abhi");
		al.add("Manu");
		al.add("Amar");
		
		
	
		Iterator itr = al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}	

	}

}
