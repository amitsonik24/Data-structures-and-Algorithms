package com.algorithms.main;

import java.util.Iterator;


public class StackUsingLinkedList<E> implements Iterable<E>{

	private Node<E> first;
	private Node<E> last;
	int size;

	void push(E o) {
		Node<E> old_last = last;
		last = new Node<E>();
		last.item = o;
		last.previous = old_last;
		if (old_last != null) {
			old_last.next = last;
		} else {
			first = last;
		}
		size++;
	}

	E pop() {
		Node<E> nodeToBeReturned=first;
		Node<E> new_first = first.next;
		new_first.previous = null;
		first = new_first;
		size--;
		return nodeToBeReturned.item;
	}

	@SuppressWarnings("hiding")
	private class Node<E> {
		E item;
		Node<E> next;
		@SuppressWarnings("unused")
		Node<E> previous;
	}

	public Iterator<E> iterator() {
		return new LinkedListIterator();
	}

	private class LinkedListIterator implements Iterator<E> {
		private int i = size;
		Node<E> currentNode;

		public boolean hasNext() {
			return i > 0;
		}

		public E next() {
			if (i == size) {
				currentNode = first;

			} 
			i--;
			Node<E> nodeToBeReturned = currentNode;
			currentNode = currentNode.next;
			return nodeToBeReturned.item;

		}

		public void remove() {
		}
	}
}
