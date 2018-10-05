package section1;

public class JosephusProblem {

    static class Node {
        int value;
        Node next;
    }

    public static void main(String[] args) {

        int m = 2;
        int n = 7;

        Node head = new Node();
        head.value = 0;
        head.next = head;

        Node last = head;

        for(int i = 1; i<n; i++){
            Node temp = new Node();
            temp.value = i;
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }

        Node prev = last.next;
        Node current = last.next;

        while (prev.next != prev){

            int count = 0;

            while (count != m-1){
                prev = current;
                current = current.next;
                count++;
            }

            prev.next = current.next;
            System.out.println(current.value);
            current = current.next;
        }

        System.out.println(prev.value);

    }
}
