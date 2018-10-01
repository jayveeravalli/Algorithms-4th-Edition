package section1.dataStructures;

import java.util.Iterator;

public class ResizingArrayQueueOfString implements Iterable<String>{

    private int n = 0;
    private String[] a = new String[1];

    public int size(){
        return n;
    }

    public boolean isEmpty(){
        return n==0;
    }

    public void enqueue(String item){
        if(n>0 && n == a.length){
            resize(a.length * 2);
        }
        a[n++] = item;
    }

    public String dequeue(){
        String item = a[0];
        removeElementFromBeginning();
        n--;
        a[n] = null;
        if(n>0 && n == (a.length/4)){
            resize(a.length/2);
        }
        return item;
    }

    private void resize(int newLength){
        String temp[] = a;
        a = new String[newLength];
        for (int i = 0; i < n; i++) {
            a[i] = temp[i];
        }
    }

    private void removeElementFromBeginning(){
        for(int i = 1 ; i < n; i++){
            a[i-1] = a[i];
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new ArrayIterator<>();
    }

    class ArrayIterator<String> implements Iterator{
        int i = 0;
        @Override
        public boolean hasNext() {
           return i<n;
        }

        @Override
        public Object next() {
            return a[i++];
        }
    }
}
