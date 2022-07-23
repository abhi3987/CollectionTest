package com.CollectionTest;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestCollectionTestQueue {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Abhi");
		deque.add("Amar");
		deque.add("Avinash");
		deque.add("Sunil");

		// traversing element

		for (String str : deque) {

			System.out.println(str);
		}

	}

}
