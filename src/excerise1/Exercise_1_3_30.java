package excerise1;

import section1.dataStructures.LinkedList;

public class Exercise_1_3_30 {

    public static void main(String[] args) {
        LinkedList<Integer> integers =  new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        print(integers);

        integers.reverse();
        System.out.println("After reversing the list");

        print(integers);

        // Empty List test
        LinkedList<Integer> integers1 = new LinkedList<>();
        integers1.reverse();

        // One Element Test
        LinkedList<Integer> integers2 = new LinkedList<>();
        integers2.add(1);
        integers2.reverse();
        System.out.println("Reversed without errors");
        print(integers2);
    }

    public static void print(LinkedList<Integer> linkedList){
        for (int i : linkedList){
            System.out.println(i);
        }
    }
}
