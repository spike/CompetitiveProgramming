class MyStack() {
    val queue: Deque<Int> 
    init {
        queue = ArrayDeque()
    }
    fun push(x: Int) {
        queue.addLast(x)
        for (i in 1..queue.size-1) {
            queue.addLast(queue.removeFirst())
        } 
        println(queue)
    }
    fun pop(): Int {
        return queue.removeFirst()
    }

    fun top(): Int {
        return queue.peekFirst()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }
}


/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */