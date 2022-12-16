class MyQueue() {
    // See my notes to understand the metaphor I'm using
    private val truckBedStack: Stack<Int> = Stack()
    private val sideOfTheRoadStack: Stack<Int> = Stack()

    fun initialize() {
        truckBedStack.clear()
        sideOfTheRoadStack.clear()
    }
    
    fun push(x: Int) {
        // so as to not disturb FIFO mandate
        // make sure all the meals (if any) are
        // on the truckBedStack already
        while (sideOfTheRoadStack.isNotEmpty()) {
            truckBedStack.push(sideOfTheRoadStack.pop())
        }
        truckBedStack.push(x)
    }
    
    fun unloadTruckBedStack() {
        while (truckBedStack.isNotEmpty()) {
            sideOfTheRoadStack.push(truckBedStack.pop());
        }
        return
    }
    
    fun pop(): Int {
        unloadTruckBedStack()
        return sideOfTheRoadStack.pop()
    }

    fun peek(): Int {
        unloadTruckBedStack()
        return sideOfTheRoadStack.peek()
    }

    fun empty(): Boolean {
        return (truckBedStack.isEmpty() && 
        sideOfTheRoadStack.isEmpty());
    }
}
