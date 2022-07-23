package com.CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Ravi");
		list.add("Ajay");
		list.add("Vijay");
		list.add("Rahul");
		list.add("Avinash");

		System.out.println("Traversing list through LIst Iterator:");
		// Here element iterates in reverse order

		ListIterator<String> list1 = list.listIterator(list.size());

		while (list1.hasPrevious()) {

			String str = list1.previous();

			System.out.println(str);
		}
		
		System.out.println("Traversing list through for loop:");
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
		System.out.println("Tranversing list through forEach() method:");
		
		//the forEach() method is a new feature ,introduced in java 8
		
		list.forEach(a->
		{
			
			// Here we are using lamda expression
			
			System.out.println(a);
		

	});
		
		System.out.println("Traversing list through forEachRemaining() method:");
		
		Iterator<String> itr = list.iterator();
		 itr.forEachRemaining(a-> //Here, we are using lamda expression
		 
		 {
			 
			 System.out.println(a);
		 });
		}

}
