package com.algorithms.main;

import java.lang.reflect.Array;

public class LIFOStack<E> {
	private int maxSize;
	private int currentSize = 0;

	private E[] lifoStackArray;

	@SuppressWarnings("unchecked")
	LIFOStack(Class<E> c, int size) {

		lifoStackArray = (E[]) Array.newInstance(c, size);
		this.maxSize = size;
	}

	int currentSize() {
		return currentSize;
	}

	void push(E o) throws Exception {
		if (currentSize + 1 <= maxSize) {
			lifoStackArray[currentSize] = o;
			currentSize++;
		} else {
			throw new Exception("You have exceeded the maximum size of queue");
		}

	}

	E pop() throws Exception {
		if (currentSize > 0) {
			currentSize--;
			return lifoStackArray[currentSize];
			
		} else {
			throw new Exception("Cannot perform this operation, size of queue zero");
		}
	}

	E getElementAt(int index) {
		return lifoStackArray[index];
	}
}
