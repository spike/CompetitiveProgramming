/*
costs = [1,3,2,4,1], coins = 7
[1,1,2,3,4]
4
costs = [10,6,8,7,7,8], coins = 5
6,7,7,8,8,10
0
costs = [1,6,3,1,2,5], coins = 20
1,1,

*/

class Solution {
    fun maxIceCream(costs: IntArray, coins: Int): Int {
        costs.sort()
        var remain = coins
        var count = 0
        for (p in costs) {
            if (p <= remain) {
                remain -= p
                count++
            } else {
                return count
            }
        }
        return count
    }
}