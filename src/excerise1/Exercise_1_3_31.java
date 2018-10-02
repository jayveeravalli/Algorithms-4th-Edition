package excerise1;

import section1.dataStructures.DoubleLinkedList;

public class Exercise_1_3_31 {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> list =  new DoubleLinkedList<>();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        print(list);

        list.insertAtBeginning(0);

        print(list);

        list.insertAtEnd(6);

        print(list);

        list.removeFromBeginning();

        print(list);

        list.removeFromEnd();

        print(list);

        list.removeFromEnd();
        list.removeFromEnd();
        list.removeFromEnd();
        list.removeFromEnd();
        list.removeFromEnd();

        print(list);

        print(list);

    }

    public static void print(DoubleLinkedList<Integer> linkedList){
        for(int i : linkedList){
            System.out.println(i);
        }
    }
}
