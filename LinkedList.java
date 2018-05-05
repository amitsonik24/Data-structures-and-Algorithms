package com.algorithms.main;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

	private Node<E> first;
	private Node<E> last;
	int size;

	void add(E o) {
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

	void remove(E o) throws Exception {
		if (size > 0) {
			boolean itemFound = false;
			Node<E> node = first;
			while (node.next != null) {
				if (o.equals(node.item)) {
					itemFound = true;
					break;
				}
				node = node.next;
			}
			if (itemFound == true) {
				if (node.previous != null) {
					Node<E> previous = node.previous;
					previous.next = node.next;
				} else {
					first = node.next;
					first.previous = null;
				}
				size--;
			} else {
				throw new Exception("Fatal: Element Not Found");
			}
		} else {
			throw new Exception("Fatal: List size zero");
		}
	}

	void removeFirst() throws Exception {
		if (size > 0) {
			if (size == 1) {
				first = null;
				last = null;
				size = 0;
			} else {
				Node<E> new_first = first.next;
				new_first.previous = null;
				first = new_first;
				size--;
			}
		} else {
			throw new Exception("Fatal: List size zero");
		}
	}

	void removeLast() throws Exception {
		if (size > 0) {
			if (size == 1) {
				first = null;
				last = null;
				size = 0;
			} else {
				Node<E> new_last = last.previous;
				new_last.next = null;
				last = new_last;
				size--;
			}
		} else {
			throw new Exception("Fatal: List size zero");
		}

	}

	@SuppressWarnings("hiding")
	private class Node<E> {
		E item;
		Node<E> next;
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
