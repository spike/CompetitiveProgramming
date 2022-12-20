class Solution {
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val visited = Array(rooms.size) { false }
        dfs(0, rooms, visited)
        
        for (b in visited) {
            if (!b) return false
        }
        return true
    }
    fun dfs (i: Int, rooms: List<List<Int>>, visited: Array<Boolean>) {
        if (visited[i]) return
        visited[i] = true
        for (n in rooms[i]) {
            dfs(n, rooms, visited)
        }
        return
    }
}