class Solution {
    fun diagonalSort(mat: Array<IntArray>): Array<IntArray> {
        val hm = HashMap<Int, PriorityQueue<Int>>()
        for (x in mat[0].indices) {
            for (y in mat.indices) {
                val key = x - y
                val pq = hm.getOrDefault(key, PriorityQueue<Int>())
                pq.add(mat[y][x])
                hm[key] = pq
            }
        }
        println(hm.size)
        for (x in mat[0].indices) {
            for (y in mat.indices) {
                val key = x - y
                mat[y][x] = hm[key]!!.poll()
            }
        }
        return mat
    }
}