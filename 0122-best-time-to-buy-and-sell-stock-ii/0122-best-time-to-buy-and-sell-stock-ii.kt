class Solution {
    fun maxProfit(prices: IntArray): Int {
        var prev = prices[0]
        var profit = 0
        for (i in 1..prices.lastIndex) {
               if (prices[i] > prev) {
                   profit += prices[i]-prev
               }
               prev = prices[i]
        }
        return profit
    }
}