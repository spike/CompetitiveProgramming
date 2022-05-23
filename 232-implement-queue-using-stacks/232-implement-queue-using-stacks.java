class MyQueue {
    // See my notes at
// https://github.com/spike/CompetitiveProgramming/
    // to understand the metaphor I'm using
    Stack<Integer> truckBedStack;
    Stack<Integer> sideOfTheRoadStack;
    
    public MyQueue() {
        truckBedStack = new Stack();
        sideOfTheRoadStack = new Stack();
    }
    
    public void push(int x) {
        // so as to not disturb FIFO mandate
        // make sure all the meals (if any) are
        // on the truckBedStack already
        while (!sideOfTheRoadStack.isEmpty()) {
            truckBedStack.push(sideOfTheRoadStack.pop());
        }
        truckBedStack.push(x);
    }
    public void unloadTruckBedStack() {
        while (!truckBedStack.isEmpty()) {
            sideOfTheRoadStack.push(truckBedStack.pop());
        }
        return;
    }
    public int pop() {
        unloadTruckBedStack();
        return sideOfTheRoadStack.pop();
    }
    
    public int peek() {
        unloadTruckBedStack();
        return sideOfTheRoadStack.peek();
    }
    
    public boolean empty() {
        return (truckBedStack.isEmpty() && 
                sideOfTheRoadStack.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */