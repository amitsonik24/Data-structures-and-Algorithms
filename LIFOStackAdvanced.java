package com.algorithms.main;

import java.lang.reflect.Array;
import java.util.Iterator;

public class LIFOStackAdvanced<E> implements Iterable<E> {

	private E pointer;
	private int numberOfItems = 0;
	private LIFOStackNode<E>[] lifoStackArray;
	private int maxSize;

	@SuppressWarnings("unchecked")
	LIFOStackAdvanced(Class<E> c, int size) {

		lifoStackArray = (LIFOStackNode<E>[]) Array.newInstance(c, size);
		this.maxSize = size;
	}

	void push(E objectToBePushed) throws Exception{
		if (numberOfItems < maxSize) {
			if (numberOfItems == 0) {
				pointer = objectToBePushed;
				LIFOStackNode<E> node = new LIFOStackNode<E>(objectToBePushed, null);
				lifoStackArray[numberOfItems] = node;
				numberOfItems++;
			} else {
				pointer = objectToBePushed;
				LIFOStackNode<E> node = new LIFOStackNode<E>(objectToBePushed, null);
				lifoStackArray[numberOfItems] = node;

				lifoStackArray[numberOfItems - 1].setReference(objectToBePushed);
				numberOfItems++;

			}
		}
		else{
			throw new Exception("INVALID PUSH REQUEST");
		}
	
	
	}

	void pop() throws Exception {
		if (numberOfItems > 0) {
			pointer = lifoStackArray[numberOfItems - 1].getContent();
			lifoStackArray[numberOfItems - 1].setReference(null);
			lifoStackArray[numberOfItems] = null;
			numberOfItems--;
			
		} else {
			throw new Exception("INVALID POP REQUEST");
		}

	}

	E getTopElement() {
		return pointer;
	}


	@Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {
            private int index = numberOfItems;

            @Override
            public boolean hasNext() {
                return index>0;
            }

            @Override
            public E next() {
            	int intermediate=index;
            	index--;
                return (E)lifoStackArray[intermediate].getContent();
                
            }

            @Override
            public void remove() {

            }
        };

        return iterator;
    }










}
