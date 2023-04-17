class Solution { /*
candies = [2,3,5,1,3], extraCandies = 3
           5,6,8,4,6
           t,t,t,f,t
candies = [4,2,1,1,2], extraCandies = 1
           5,3
           t
candies = [12,1,12], extraCandies = 10
*/
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var max = 0
        for (n in candies) {
            max = maxOf(n, max)
        }
        val res = MutableList<Boolean>(candies.size) {false}
        for (i in candies.indices) {
            if (extraCandies + candies[i] >= max) {
                res.set(i, true)
            } 
        }
        return res
    }
}