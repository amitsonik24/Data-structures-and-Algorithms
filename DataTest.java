package com.algorithms.main;

public class DataTest {

	public static void main(String[] args) throws Exception {

		LIFOStackAdvanced<Integer> integerStack = new LIFOStackAdvanced<Integer>(Integer.class, 100);
		integerStack.push(1);
		integerStack.push(2);
		for (Integer loopInteger : integerStack) {
			System.out.println(loopInteger);
		}
		// LIFOStack<Integer> integerStack= new
		// LIFOStack<Integer>(Integer.class);
		// try {
		// integerQueue.push(1);
		// integerQueue.push(2);
		// integerQueue.pop();
		//
		// System.out.println(integerQueue.currentSize());
		//
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		//
	}
}
