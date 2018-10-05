package excerise1;

import section1.dataStructures.CircularLinkedList;
import section1.dataStructures.LinkedList;
import section1.dataStructures.LinkedQueue;

import javax.management.Query;
import java.util.Queue;

/**
 * Implemented the solution using Both Linked List, Circular Linked List and Queue
 *
 * All the data structures mentioned above are available @package section1.dataStructures
 *
 * Simple Circular Linked List solution is available in @package section1 @file JosephusProblem.java
 *
 * **/

public class Exercise_1_3_37 {

    public static void main(String[] args) {
        int size = 14;
        int m = 2;

        CircularLinkedList<Integer> list = createNewList(size);

        printPos(list, 2);

        LinkedList linkedList = createNewLinkedList(size);

        usingLinkedList(linkedList, m);


        printPosUsingQueue(createQueue(size), m);
    }

    private static CircularLinkedList<Integer> createNewList(int size){
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        for(int i = 0; i< size; i++){
            list.add(i);
        }
        return list;
    }

    private static LinkedList<Integer> createNewLinkedList(int size){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i< size; i++){
            list.add(i);
        }
        return list;
    }


    private static LinkedQueue<Integer> createQueue(int size){
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        for(int i = 0; i<size; i++){
            queue.enqueue(i);
        }

        return queue;
    }

    private static void printPos(CircularLinkedList<Integer> list, int m){
       int current = 0;
       int kill;

       while (list.size() != 1){
           kill = current + m-1;
           if(kill > list.size()-1){
               kill = kill % (list.size());
           }
           System.out.println(list.remove(kill));
           current = kill;

       }
       
    }


    private static void usingLinkedList(LinkedList<Integer> list, int m){
        int current = 0;
        int kill;

        while (list.size() != 1){
            kill = current + m-1;
            if(kill > list.size()-1){
                kill = kill % (list.size());
            }
            System.out.println(list.get(kill));
            list.remove(kill);
            current = kill;

        }

    }

    private static void printPosUsingQueue(LinkedQueue<Integer> queue, int m){
        int pos = 1;
        while (queue.size()!=1){
            int i = queue.dequeue();

            if(pos%m == 0){
                System.out.println(i);
            } else {
                queue.enqueue(i);
            }

            pos++;
        }
        System.out.println(queue.dequeue());
    }


}
