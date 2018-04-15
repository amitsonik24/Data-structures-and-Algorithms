package com.algorithms.main;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag<E> implements Iterable<E> {
	int noOfItems;
	private ArrayList<E> bagItems;

	Bag() {
		bagItems = new ArrayList<E>();
	}

	void add(E o) {
		bagItems.add(o);
		noOfItems++;
	}

	boolean isEmpty() {
		if (noOfItems == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index<noOfItems;
            }

            @Override
            public E next() {
            	int intermediate=index;
            	index++;
                return (E)bagItems.get(intermediate);
                
            }

            @Override
            public void remove() {

            }
        };

        return iterator;
    }
}

