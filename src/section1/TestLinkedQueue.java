package section1;

import section1.dataStructures.LinkedQueue;

public class TestLinkedQueue {
	
	public static void main(String args[]) {
		LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
		linkedQueue.enqueue(1);
		linkedQueue.enqueue(2);
		linkedQueue.enqueue(3);
		
		for(int i : linkedQueue) {
			System.out.println(i);
		}
		
		System.out.println(linkedQueue.dequeue());
	}

}
