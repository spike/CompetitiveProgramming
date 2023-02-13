class Solution {
   /*
    s = "101101", queries = [[0,5],[1,2]]
         012345
   */
    fun substringXorQueries(s: String, queries: Array<IntArray>): Array<IntArray> {
        val hm = HashMap<String, IntArray>()
        for (i in s.indices) {
            for (j in i..s.lastIndex) {
                if (j - i > 32) break
                val p = s.slice(i..j) 
                if (!hm.containsKey(p)) {
                    hm[p] = intArrayOf(i, j)
                }
            }
        }
        val res = Array<IntArray>(queries.size) { IntArray(2) {-1} }
        for (i in queries.indices) {
            val q = queries[i]
            val key = Integer.toBinaryString(q[0] xor q[1])
            if (hm.containsKey(key)) {
                res[i][0] = hm[key]!![0]
                res[i][1] = hm[key]!![1]
            }
        }
        return res
    }
}