package section1.dataStructures;

import java.util.Iterator;

public class CircularLinkedList<T> implements Iterable<T>{

    class Node {
        T value;
        Node next;
    }

    private Node last;
    private int n = 0;

    public int size(){
        return n;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void add(T value){
        Node temp = new Node();
        temp.value = value;
        if(isEmpty()){
            temp.next = temp;
            last = temp;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        n++;
    }


    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T>{
        int i = 0;
        Node curr = last.next;
        @Override
        public boolean hasNext() {
            return i < size();
        }

        @Override
        public T next() {
            T value = curr.value;
            curr = curr.next;
            i++;
            return value;
        }
    }
}
