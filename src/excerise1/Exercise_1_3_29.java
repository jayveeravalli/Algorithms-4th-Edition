package excerise1;

import section1.dataStructures.CircularLinkedList;

public class Exercise_1_3_29 {

    public static void main(String[] args) {
        CircularLinkedList<Integer> integers = new CircularLinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        for(int i : integers){
            System.out.println(i);
        }
    }
}
