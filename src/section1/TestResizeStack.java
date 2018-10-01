package section1;

import section1.dataStructures.ResizinArrayStack;

import java.util.Iterator;

public class TestResizeStack {

	public static void main(String[] args) {
		ResizinArrayStack<Integer> arrayStack = new ResizinArrayStack<>();
		for(int i =0; i< 10; i++) {
			arrayStack.push(i);
		}
		
		for(int i : arrayStack) {
			System.out.println(i);
		}
		
		Iterator<Integer> i = arrayStack.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(int j = 0; j<10; j++) {
			System.out.println(arrayStack.size());
			System.out.println(arrayStack.pop());
			System.out.println(arrayStack.size());
		}
	}

}
