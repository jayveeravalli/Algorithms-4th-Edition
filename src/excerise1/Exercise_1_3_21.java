package excerise1;

import section1.dataStructures.LinkedList;

public class Exercise_1_3_21 {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");

        System.out.println(linkedList.find("b"));
        System.out.println(linkedList.find("e"));

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);

        System.out.println(integerLinkedList.find(1));
        System.out.println(integerLinkedList.find(5));

    }
}
