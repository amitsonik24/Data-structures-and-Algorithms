package com.algorithms.main;

public class DataTest {

	public static void main(String[] args) throws Exception {

		LinkedList<Integer> linkedListForTesting= new LinkedList<Integer>();
		linkedListForTesting.add(1);
		linkedListForTesting.add(3);
		linkedListForTesting.add(4);
		linkedListForTesting.removeFirst();
		linkedListForTesting.removeLast();
		linkedListForTesting.removeLast();
		//linkedListForTesting.remove(2);
		for(Integer i:linkedListForTesting){
			System.out.println(i);
		}
		
	}
}
