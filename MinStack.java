import java.util.Stack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;


    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push 
    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Pop 
    public int pop() {
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            if (removed == minStack.peek()) {
                minStack.pop();
            }
            return removed;
        }
        return -1;  
    }

    // Min 
    public int min() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1;  
    }
}




public class MinStackTest {

    @Test
    public void testPushAndMin() {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        assertEquals(1, stack.min());
    }

    @Test
    public void testPopAndMin() {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.pop();
        assertEquals(2, stack.min());
    }

    @Test
    public void testPushSequence() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(1, stack.min());
    }
}
