class Solution {
    fun nearestExit(maze: Array<CharArray>, e: IntArray): Int {
        val q: Queue<Triple<Int, Int, Int>> = LinkedList<Triple<Int,Int,Int>>()
        val v = HashSet<String>()
        q.add(Triple(e[0], e[1], 0))
        while(!q.isEmpty()) {
            val (y, x, c) = q.remove()
            if ("$y-$x" in v) continue
            v.add("$y-$x")
            if (x-1 >= 0) {
                if (maze[y][x-1] == '.') q.add(Triple(y, x-1, c+1)) 
            } else { if (c != 0) return c }
            if (y-1 >= 0) {
                if (maze[y-1][x] == '.') q.add(Triple(y-1, x, c+1))
            } else { if (c != 0) return c }
            if (y+1 <= maze.lastIndex) {
                if (maze[y+1][x] == '.') q.add(Triple(y+1, x, c+1))
            } else { if (c != 0) return c }
            if (x+1 <= maze[0].lastIndex) {
                if (maze[y][x+1] == '.') q.add(Triple(y, x+1, c+1))
            } else { if (c != 0) return c }
        }
        return -1
    }
}
            