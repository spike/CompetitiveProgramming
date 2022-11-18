/*
7
            6
      5  
                4
         3
 
   1                               */
class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0
        var start = prices[0]
        for (i in 1..prices.lastIndex) {
            if (prices[i] < start) {
                start = prices[i]
            } else {
                max = Math.max(prices[i]-start, max)
            }
        }
        return max
    }
}