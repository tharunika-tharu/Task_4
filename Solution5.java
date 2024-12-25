import java.util.Stack;

public class Solution5 extends StackOperations {
    public static void main(String[] args) {
        StackOperations stack = new StackOperations();

        //check if stack is empty
        System.out.println("Before adding elements into stack, stack is empty: "+stack.isEmpty());
        //push elements into stack
        stack.push(34);
        stack.push(36);
        stack.push(23);
        stack.push(45);

        //check if stack is empty
        System.out.println("After adding elements into stack, stack is empty: "+stack.isEmpty());

        //pop elements from the stack
        System.out.println("The popped element is:"+stack.pop());
    }
}
