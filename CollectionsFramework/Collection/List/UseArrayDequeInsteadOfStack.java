package CollectionsFramework.Collection.List;

import java.util.ArrayDeque;
import java.util.Deque;

public class UseArrayDequeInsteadOfStack {

    //We use ArrayDeque instead of Stack because it is significantly faster and more memory-efficient due to not having the performance overhead of unnecessary thread synchronization.

    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();

        // ALWAYS declare using the Deque interface, interface on the left side
        Deque<String> stack = new ArrayDeque<>();

        // 1. Push elements onto the stack
        stack.push("Base Layer");
        stack.push("Middle Layer");
        stack.push("Top Layer");

        System.out.println(stack+"\n");

        // 2. Peek at the top element without removing it
        System.out.println("Top element is: " + stack.peek()); // Output: Top Layer

        // 3. Pop elements off the stack
        System.out.println("Popped: " + stack.pop()); // Output: Top Layer
        System.out.println("Popped: " + stack.pop()); // Output: Middle Layer

        // 4. Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        // 5. Printing the remaining stack
        System.out.println("Remaining Stack structure: " + stack); // Output: [Base Layer]

    }
}
