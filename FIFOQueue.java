package com.algorithms.main;

import java.lang.reflect.Array;

public class FIFOQueue<E> {
	private int maxSize;
	private int currentSize = 0;

	private E[] fifoqueueArray;

	@SuppressWarnings("unchecked")
	FIFOQueue(Class<E> c, int size) {

		fifoqueueArray = (E[]) Array.newInstance(c, size);
		this.maxSize = size;
	}

	int currentSize() {
		return currentSize;
	}

	void push(E o) throws Exception {
		if (currentSize + 1 <= maxSize) {
			fifoqueueArray[currentSize] = o;
			currentSize++;
		} else {
			throw new Exception("You have exceeded the maximum size of queue");
		}

	}

	void pop() throws Exception {
		if (currentSize > 0) {
			fifoqueueArray[0] = null;
			currentSize--;
		} else {
			throw new Exception("Cannot perform this operation, size of queue zero");
		}
	}

	E getElementAt(int index) {
		return fifoqueueArray[index];
	}



}
