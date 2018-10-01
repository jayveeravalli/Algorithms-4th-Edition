package section1.dataStructures;

import java.util.Iterator;

public class LinkedStack<T> implements Iterable<T> {

	private class Node {
		T item;
		Node next;
	}

	private Node first;
	private int n = 0;

	public boolean isEmpty() {
		return n == 0;
	}

	public int size() {
		return n;
	}

	public void push(T t) {
		Node temp = new Node();
		temp.item = t;
		temp.next = first;
		first = temp;
		n++;
	}
	
	public T pop() {
		T item = first.item;
		first = first.next;
		n--;
		return item;
	}

	@Override
	public Iterator<T> iterator() {
		return new ReverseIterator();
	}

	private class ReverseIterator implements Iterator<T> {

		private Node current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			T item = current.item;
			current = current.next;
			return item;
		}

	}

}
