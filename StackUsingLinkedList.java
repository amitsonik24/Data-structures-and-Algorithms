package com.algorithms.main;

import java.util.Iterator;

public class StackUsingLinkedList<E> implements Iterable<E> {

	private Node<E> first;
	private int size;

	public void push(E o) {
		Node<E> oldfirst = first;
		first = new Node<E>();
		first.item = o;
		first.next = oldfirst;
		size++;
	}

	public void pop() throws Exception {
		if (size > 0) {
			first = first.next;

			size--;
		} else {
			throw new Exception("Error: Stack size zero");
		}

	}

	@SuppressWarnings("hiding")
	private class Node<E> {
		E item;

		Node<E> next;

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
