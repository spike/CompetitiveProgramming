class Solution {
    fun equalPairs(grid: Array<IntArray>): Int {
        var count = 0
        val hm = HashMap<String, Array<Int>>()
       // val hm1 = HashMap<String, A>()
        val sb = StringBuilder()
        for (y in grid.indices) {
            sb.clear()
            for (x in grid[0].indices) {
                sb.append(grid[y][x])
                sb.append(":")
            }
            val a: Int = if (hm!![sb.toString()] == null) 1 else (hm!![sb.toString()]!![0] + 1)
            hm[sb.toString()] = arrayOf<Int>(a, a, 0)
        }
        sb.clear()
        for (x in grid.indices) {
            sb.clear()
            for (y in grid[0].indices) {
                sb.append(grid[y][x])
                sb.append(":")
            }
            
            val total: Int = if (hm!![sb.toString()] == null) 1 else (hm!![sb.toString()]!![0] + 1)
            val b: Int = if (hm!![sb.toString()] == null) 1 else (hm!![sb.toString()]!![2] + 1)
            val m: Int = if (hm!![sb.toString()] == null) 0 else (hm!![sb.toString()]!![1])
            hm[sb.toString()] = arrayOf<Int>(total, m, b)
        }
        sb.clear()
        for ((_, value) in hm) {
           // println("$key --> ${value.contentToString()}")
            if (value[1] > 0 && value[2] > 0) count += value[1] * value[2]
        }
        return count
    }
}