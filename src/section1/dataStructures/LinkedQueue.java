package section1.dataStructures;

import java.util.Iterator;


public class LinkedQueue<T> implements Iterable<T>{
	
	private class Node {
		T item;
		Node next;
	}
	
	private Node first;
	private Node last;
	private int n = 0;
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int size() {
		return n;
	}
	
	public void enqueue(T t) {
		if(!isEmpty()) {
			Node temp = new Node();
			temp.item = t;
			temp.next = null;
			last.next = temp;
			last = temp;
		} else {
			last = new Node();
			last.item = t;
			last.next = null;
			first = last;
		}
		n++;
	}
	
	public T dequeue() {
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
