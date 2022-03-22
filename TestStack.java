import java.util.Scanner;

/**
 * Created by TGC on 23/01/2022.
 */
public class TestStack {
    public static void main(String[] args) {
        ArrayStack<Integer>myStack= new ArrayStack<>(5);
        Scanner in =new Scanner(System.in);
        System.out.println("is the stack empty?"+myStack.isEmpty());
        System.out.println("input elements");
        for (int i = 0; i < 5; i++) {
            myStack.push(in.nextInt());
            System.out.println("top element is"+myStack.top());
            System.out.println("size of stack is"+myStack.size());
            System.out.println("is the stack empty"+myStack.isEmpty());

        }
        for (int i = 0; i < 6; i++) {
            System.out.println("deleted elements is"+myStack.pop());
            System.out.println("top element is"+myStack.top());
            System.out.println("size of stack is"+myStack.size());
            System.out.println("is the stack empty"+myStack.isEmpty());

        }
    }
}
