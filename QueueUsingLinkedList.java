package com.algorithms.main;

import java.util.Iterator;

public class QueueUsingLinkedList<E> implements Iterable<E> {
	@SuppressWarnings("unused")
	private Node<E> first;
	private Node<E> last;
	int size;

	void enqueue(E o) {
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

	E dequeue() throws Exception {
		if (size > 0) {
			Node<E> old_last = last;
			Node<E> new_last = last.previous;
			new_last.next = null;
			last = new_last;
			size--;
			return old_last.item;
		} else {
			throw new Exception("Error: Queue Size Zero");
		}

	}

	@SuppressWarnings("hiding")
	private class Node<E> {
		E item;
		@SuppressWarnings("unused")
		Node<E> next;
		Node<E> previous;
	}

	public Iterator<E> iterator() {
		return new QueueUsingLinkedListIterator();
	}

	private class QueueUsingLinkedListIterator implements Iterator<E> {
		private int i = size;
		Node<E> currentNode;

		public boolean hasNext() {
			return i > 0;
		}

		public E next() {
			if (i == size) {
				currentNode = last;

			}
			i--;
			Node<E> nodeToBeReturned = currentNode;
			currentNode = currentNode.previous;
			return nodeToBeReturned.item;

		}

		public void remove() {
		}
	}

}
