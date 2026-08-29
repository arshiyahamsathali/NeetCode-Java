class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
    }
    public void push(int value) {
        stack.push(value);
        if(minStack.isEmpty() || value <= minStack.peek()) minStack.push(value);
    }
    
    public void pop() {
        int removed = stack.pop();
        if(removed == minStack.peek()) minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}