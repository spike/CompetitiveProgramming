class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if (r * c != mat.size * mat[0].size) return mat
        val q: Queue<Int> = LinkedList<Int>()
        for (y in mat.indices) {
            for (x in mat[0].indices) {
                q.add(mat[y][x])
            }
        }
        val arr = Array<IntArray>(r) { IntArray(c) }
        for (y in 0 until r) {
            for (x in 0 until c) {
                arr[y][x] = q.remove()
            }
        }
        return arr
    }
}