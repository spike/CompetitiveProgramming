class Solution {
    /*
    ["0:start:0",
        "0:start:2",
        "0:end:5",
        
        "0:start:6",
        "0:end:6",
    "0:end:7"]
    */
    fun exclusiveTime(n: Int, logs: List<String>): IntArray {
        val arr = IntArray(n) { 0 }
        val stack = Stack<Pair<Int, Int>>()
        for (log in logs) {
            val l = log.split(":")
            val id = l[0].toInt()
            val time = l[2].toInt()

            if (l[1].equals("start")) {
                stack.push(Pair(id, time))
            } else {
                val (_, oldTime) = stack.pop()
                val diff = time - oldTime + 1
                arr[id] += diff
                if (!stack.isEmpty()) {
                    arr[stack.peek().first] -= diff
                }
            }
        }
        return arr
    }
}