import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push 
    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    // Pop 
    public void pop() {
        if (!stack.isEmpty()) {
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }
    }

    // Min 
    public int min() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1; 
    }

    public static void main(String[] args) {
        MinStack myStack = new MinStack();
        myStack.push(3);
        myStack.push(2);
        myStack.push(5);
        myStack.push(1);
        System.out.println(myStack.min());  // 1
        myStack.pop();
        System.out.println(myStack.min());  // 2
    }
}
