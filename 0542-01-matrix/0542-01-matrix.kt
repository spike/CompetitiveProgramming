class Solution {
    fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
        val q: Queue<Triple<Int, Int, Int>> = LinkedList()
        val visited = HashSet<Pair<Int, Int>>()
        
        for (i in mat.indices)
            for (j in mat[i].indices) {
                if (mat[i][j] == 0 && visited.add(Pair(i, j))) 
                    q.add(Triple(i, j, 0))
            }

        val result = Array(mat.size) { IntArray(mat[0].size) }

        while (q.isNotEmpty()) {
            val (i, j, distance) = q.remove()
            val moves = getMoves(i, j)
            
            for (move in moves) {
                val (nextI, nextJ) = move
                if (nextI in mat.indices && nextJ in mat[0].indices && visited.add(Pair(nextI, nextJ))) {
                    result[nextI][nextJ] = distance + 1
                    q.add(Triple(nextI, nextJ, distance + 1))
                }
            }
        }
        
        return result
    }
    
    fun getMoves(i: Int, j: Int): List<Pair<Int, Int>> {
        return listOf(
            Pair(i - 1, j),
            Pair(i + 1, j),
            Pair(i, j - 1),
            Pair(i, j + 1)
        )
    }
}