package queueoftwostacks;

import java.util.Stack;

public class QueueOfTwoStacks<T> {

    private final Stack<T> inputStack = new Stack<>();
    private final Stack<T> outputStack = new Stack<>();

    public QueueOfTwoStacks(T item) {
        inputStack.push(item);
    }

    public void push(T item) {
        inputStack.push(item);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }

    public boolean isEmpty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
