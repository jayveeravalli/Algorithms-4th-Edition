package section1;

import section1.dataStructures.CircularLinkedList;

public class CircularLinkedListTest {

    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        print(list);
//        list.removeLast();
//        print(list);
//        list.removeLast();
//        print(list);
//        list.removeLast();
//        print(list);
//        list.removeLast();
//        print(list);
//        list.removeLast();
//        print(list);


        list.remove(3);
        print(list);

        list.remove(1);
        print(list);

        list.remove(1);
        print(list);

        list.remove(0);
        print(list);
    }

    public static void print(CircularLinkedList<Integer> list){
        for(int i : list){
            System.out.println(i);
        }
    }
}
