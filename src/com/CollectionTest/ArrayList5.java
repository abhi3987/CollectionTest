package com.CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList5 {

	public static void main(String[] args) {

		// Creating user-defined class object

		Student s1 = new Student(101, "Abhi", 51);
		Student s2 = new Student(102, "Amit", 52);
		Student s3 = new Student(103, "Amar", 53);

		// creating arraylist

		ArrayList<Student> al = new ArrayList<>();

		al.add(s1);// Adding class object
		al.add(s2);
		al.add(s3);

		// Getting Iterator

		Iterator<Student> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
