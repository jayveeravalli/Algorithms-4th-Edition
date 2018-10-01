package section1.dataStructures;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{

    class Node {
        T value;
        Node next;
    }

    private Node last;
    private Node first;
    private int n = 0;

    public boolean isEmpty(){
        return n==0;
    }

    public int size(){
        return n;
    }

    public void add(T value){
        Node temp = new Node();
        temp.value = value;
        temp.next = null;
        if(isEmpty()){
            last = temp;
            first = last;
        } else {
            last.next = temp;
            last = temp;
        }
        n++;
    }

    public void removeLast(){
        if(isEmpty()) return;
        if(n == 1) {
            first = last = null;
            n--;
            return;
        }
        Node current = first;
        Node previous = first;
        while(current.next!=null){
            previous = current;
            current = current.next;
        }
        last = previous;
        last.next = null;
        n--;
    }

    public void remove(int pos){
        if(n <= pos) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if(n-1 == pos) {
            removeLast();
            return;
        }
        if(pos == 0){
            Node next = first.next;
            if(next!=null){
                first = next;
                n--;
            } else {
                first = last = null;
            }
        }

        Node current = first.next;
        Node prev = first;

        int i = 1;

        while (i<=pos){
            if(i==pos){
                Node next = current.next;
                prev.next = next;
                n--;
                return;
            } else {
                prev = current;
                current = current.next;
            }
            i++;
        }
    }

    public boolean find(T key){
        Node temp = first;
        while (temp.next != null){
            if(temp.value.equals(key)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T>{

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public T next() {
            T value = current.value;
            current = current.next;
            return value;
        }
    }
}
