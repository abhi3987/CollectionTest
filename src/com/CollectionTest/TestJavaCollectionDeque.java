package com.CollectionTest;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJavaCollectionDeque {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();

		queue.add("Abhi");
		queue.add("Amar");
		queue.add("Amit");
		queue.add("Aman");
		queue.add("Akash");

		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements");

		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		queue.remove();
		queue.poll();

		System.out.println("after removing two elements:");

		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
