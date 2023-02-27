class Solution {
    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
        val neighbors = Array<ArrayList<Int>>(n) { ArrayList<Int>() }
        val visited = Array<Boolean>(n) { false }
        for (i in edges.indices) {
            val a = edges[i][0]
            val b = edges[i][1]
            neighbors[a].add(b)
            neighbors[b].add(a)
        }
        return (dfs(neighbors, visited, source, destination))
           
    }
    fun dfs(neighbors: Array<ArrayList<Int>>, 
           visited: Array<Boolean>,
           start: Int,
           end: Int): Boolean {
        if (start == end) return true
        if (visited[start]) return false
        visited[start] = true
        for (e in neighbors[start]) {
            if (dfs(neighbors, visited, e, end)) return true
        }
        return false
    }
}