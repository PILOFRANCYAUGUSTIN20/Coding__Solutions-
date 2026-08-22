class MinStack {
    private Stack<Integer> stck;
    private Stack<Integer> aux;
    public MinStack() {
        stck=new Stack<>();
        aux=new Stack<>();
    }
    
    public void push(int value) {
        stck.push(value);
        if(aux.isEmpty() || value <=aux.peek()){
            aux.push(value);
        }
    }
    
    public void pop() {
        int data =stck.pop();
        if(data==aux.peek()){
            aux.pop();
        }
    }
    
    public int top() {
        return stck.peek();
    }
    
    public int getMin() {
        return aux.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */