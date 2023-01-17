class Solution {
    fun dailyTemperatures(temps: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val arr = IntArray(temps.size) { 0 }
        for (i in temps.indices) {
            while (stack.isNotEmpty() && 
                    temps[stack.peekLast()] < temps[i]) {
                val prevIndex = stack.removeLast()
                arr[prevIndex] = i - prevIndex
            }
            stack.addLast(i)
        }
     //   while (!stack.isEmpty()) {
     //       arr[stack.removeLast()] = 0
     //   }
        return arr
    }
}
