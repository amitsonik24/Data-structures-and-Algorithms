package com.algorithms.main;

public class DataTest {

	public static void main(String[] args) throws Exception {

		QueueUsingLinkedList<Integer> stackUsingLinkedListForTesting= new QueueUsingLinkedList<Integer>();
		stackUsingLinkedListForTesting.enqueue(1);
		stackUsingLinkedListForTesting.enqueue(3);
		stackUsingLinkedListForTesting.enqueue(4);
		stackUsingLinkedListForTesting.dequeue();
		stackUsingLinkedListForTesting.enqueue(5);
		for(Integer i: stackUsingLinkedListForTesting){
			System.out.println(i);
		}
		
	}
}
