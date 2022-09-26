class Solution {
    // created a custom class called Segment(val start: Int, var end: Int) 
    // transformed     [0,2,3,4,6,8,9]
    // into a queue of [0,0],[2,4],[6,6],[8,9] 
    // I basically restarted a new segment anytime there was a gap
    fun summaryRanges(nums: IntArray): List<String> {
        val q = ArrayDeque<Segment>()
        for (n in nums) {
            if (q.isEmpty()) {
                q.addLast(Segment(n, n))
            } else if (q.peekLast().end + 1 == n) {
                val g = q.removeLast()
                g.end = n
                q.addLast(g)
            } else {
                q.add(Segment(n, n))
            }
        }
    // In the second part of my function
    // I transformed my queue of [0,0], [2,4], [6,6], [8,9] 
    // into a list of             "0",  "2->4", "6",  "8->9"
        val lst = mutableListOf<String>()
        while (!q.isEmpty()) {
            val g = q.pollFirst()
            if (g.start == g.end) {
                lst.add("${g.start}")
            } else {
                lst.add("${g.start}->${g.end}")
            }
        }
        return lst
    }
    data class Segment(val start: Int, var end: Int) 
}