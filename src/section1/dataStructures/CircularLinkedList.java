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

    public T remove(int pos){
        if(n<=pos) throw new ArrayIndexOutOfBoundsException();

        if(n-1 == pos){
            return removeLast();
        }

        if(n==0){
            return removeFirst();
        }

        Node current = last.next;
        Node prev = last;

        for (int i = 0; i<n; i++){
            if(i==pos){
                prev.next = current.next;
                n--;
                return current.value;
            } else {
                prev = current;
                current = current.next;
            }
        }

        return null;

    }

    public T removeFirst(){
        Node first = last.next;
        Node next = first.next;

        if(next == last){
            last.next = last;
            n--;
            return first.value;
        } else {
            last.next = next;
            n--;
            return first.value;
        }
    }

    public T removeLast(){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException();

        if(n == 1){
            T value = last.value;
            last = null;
            n--;
            return value;
        }

        T value = last.value;
        Node first = last.next;
        Node temp = last.next;

        for(int i = 0; i<n; i++){
            if(i == n-2){
                last = temp;
                last.next = first;
             } else {
                temp = temp.next;
            }
        }
        n--;
        return value;
    }


    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T>{
        int i = 0;
        Node curr = last!=null ? last.next : null;
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
