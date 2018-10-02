package section1.dataStructures;

import java.util.Iterator;

public class DoubleLinkedList<T> implements Iterable<T>{

    class Node {
        T value;
        Node prev;
        Node next;
    }

    private Node first;
    private Node last;
    private int n = 0;

    public boolean isEmpty(){return n==0;}

    public int size(){
        return n;
    }

    public void insertAtEnd(T value){
        Node temp = new Node();
        temp.value = value;
        if(isEmpty()){
            temp.prev = null;
            temp.next = null;
            first = last = temp;
        } else {
            last.next = temp;
            temp.prev = last;
            temp.next = null;
            last = temp;
        }
        n++;
    }

    public void insertAtBeginning(T value){
        Node temp = new Node();
        temp.value = value;
        if(isEmpty()){
            temp.prev = null;
            temp.next = null;
            first = last = temp;
        } else {
            first.prev = temp;
            temp.prev = null;
            temp.next = first;
            first = temp;
        }
        n++;
    }

    public void removeFromBeginning(){
        if(isEmpty()) return;
        if(n==1){
            last = first = null;
            n--;
            return;
        }
        first = first.next;
        first.prev = null;
        n--;
    }

    public void removeFromEnd(){
        if(isEmpty()) return;
        if(n==1){
            last = first = null;
            n--;
            return;
        } else {
            last = last.prev;
            last.next = null;
            n--;
        }
    }


    @Override
    public Iterator iterator() {
        return new DoubleLinkedListIterator();
    }


    private class DoubleLinkedListIterator implements Iterator<T>{

        private Node init = first;

        @Override
        public boolean hasNext() {
            return init != null;
        }

        @Override
        public T next() {
            T value = init.value;
            init = init.next;
            return value;
        }

    }


}
