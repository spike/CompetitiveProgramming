class Solution {
    fun furthestBuilding(heights: IntArray, bricks: Int, ladders: Int): Int {
        val usedLadders = PriorityQueue<Int>()
        var b = bricks
        var l = ladders
        for (i in 1 until heights.size) {
            val diff = heights[i] - heights[i - 1]
            if (diff > 0) {
                if (l > 0) {
                    usedLadders.offer(diff)
                    l--
                } else {
                    if (usedLadders.isNotEmpty() && usedLadders.peek() < diff && usedLadders.peek() <= b) {
                        b -= usedLadders.remove()
                        usedLadders.offer(diff)
                    } else if (b >= diff) {
                        b -= diff
                    } else {
                        return i - 1
                    }
                }
            }
        }
        return heights.lastIndex
    }
}

// class Solution {
//     fun furthestBuilding(heights: IntArray, 
//                         bricks: Int, ladders: Int): Int {
//         val usedLadders = PriorityQueue<Int>()
//         var b = bricks
//         var l = ladders
//         for (i in 1..heights.lastIndex) {
//             val diff = heights[i]-heights[i-1]
//             if (diff > 0) {
//                 if (l > 0) {
//                     usedLadders.offer(diff)
//                     l--
//                 } else {
//                     if (usedLadders.isNotEmpty() &&
//                         usedLadders.peek() < diff &&
//                         usedLadders.peek() <= b) {
//                         b -= usedLadders.remove()
//                         usedLadders.offer(diff)
//                     } else {
//                         return i-1
//                     }
//                 }
//             }
//         }
//         return heights.lastIndex
//     }
// }
