class Solution {
    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        var timeTaken = 0
        for (i in tickets.indices) {
            if (i <= k) {
                timeTaken += Math.min(tickets[i], tickets[k])
            } else {
                timeTaken += Math.min(tickets[i], tickets[k]-1)
            }
        }
        return timeTaken;
    }
}