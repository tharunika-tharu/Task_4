import java.util.Stack;

public class StackOperations {

    public Stack<Integer> stack;

    //Constructor
    public StackOperations() {
        stack = new Stack<Integer>();
    }
    //method to push an element
    public void push(int elements){
        stack.push(elements);
    }

    //method to pop an element from the stack
    public int pop(){
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.pop();
    }

    //method to check if the stack is empty
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
