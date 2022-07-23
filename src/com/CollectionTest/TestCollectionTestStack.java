package com.CollectionTest;

import java.util.Iterator;
import java.util.Stack;

public class TestCollectionTestStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Abhi");
		stack.push("Amar");
		stack.push("Avinash");
		stack.push("Amit");
		stack.push("Aman");

		stack.pop();
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
