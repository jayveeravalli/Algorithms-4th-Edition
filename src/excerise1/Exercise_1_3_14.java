package excerise1;

import section1.ResizingArrayQueueOfString;

public class Exercise_1_3_14 {

    public static void main(String[] args) {
        ResizingArrayQueueOfString queue = new ResizingArrayQueueOfString();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        queue.enqueue("e");

        System.out.println("Removed Element: "+queue.dequeue());
        System.out.println("Removed Element: "+queue.dequeue());
        System.out.println("Removed Element: "+queue.dequeue());
        System.out.println("Removed Element: "+queue.dequeue());
        System.out.println("Removed Element: "+queue.dequeue());

        for (String i :
                queue) {
            System.out.println("Remaining Elements: "+i);
        }

    }
}
