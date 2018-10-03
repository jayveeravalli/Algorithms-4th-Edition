package section1;

public class ComparingLinkendList {

    private class Node<T>{
        T value;
        Node next;
    }

    /**
     *
     * The below function is to check if two single linked lists are equal, both in data and size
     *
     * The first if condition is to check if both the lists reached last node at the same time(this is to check size)
     *
     * The second if condition is to check if either of the lists reached last node before the other one
     *
     * The third if condition is to check if the data in both nodes is equal
     *
     * else we recursively call the same function on the next nodes
     * **/

    public static boolean compareTo(Node head1, Node head2){
        if(head1 == null && head2 == null){
            return true;
        }

        if(head1 == null || head2 == null){
            return false;
        }

        if(head1.value != head2.value){
            return false;
        }

        return compareTo(head1.next, head2.next);
    }

    public static void main(String[] args) {
        int i = 0;
        String s = ((Integer) i).toString();
    }

}
