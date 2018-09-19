package excerise1;

import section1.ResizinArrayStack;

public class Exercise_1_3_12 {

    public static void main(String args[]) {
        ResizinArrayStack<String> stack = new ResizinArrayStack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        copy(stack);
    }

    public static ResizinArrayStack<String> copy(ResizinArrayStack<String> stack) {
        ResizinArrayStack<String> temp = new ResizinArrayStack<>();
        ResizinArrayStack<String> temp2 = new ResizinArrayStack<>();
        for (String t : stack) {
            temp.push(t);
        }

        for (String t : temp) {
            temp2.push(t);
        }

        for(String t : temp2) {
            System.out.println(t);
        }

        return temp2;
    }

}
