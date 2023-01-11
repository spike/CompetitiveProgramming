class Solution {

    fun minTime(n: Int, edges: Array<IntArray>, hasApple: List<Boolean>): Int {
        val adjList = HashMap<Int, ArrayList<Int>>()
        for (e in edges) {
            adjList[e[0]] = adjList.getOrDefault(e[0], ArrayList<Int>())
            adjList[e[0]]!!.add(e[1])
            
            adjList[e[1]] = adjList.getOrDefault(e[1], ArrayList<Int>())
            adjList[e[1]]!!.add(e[0])
        }
        return calculateMinTime(adjList, hasApple, 0, HashSet<Int>())
    }

    fun calculateMinTime(root: HashMap<Int, ArrayList<Int>>, hasApple: List<Boolean>, curr: Int, visited: HashSet<Int>): Int {
        if (visited.contains(curr)) { return 0 }
        visited.add(curr)
        var ans = 0
        for (c in root[curr] ?: emptyList<Int>()) {
            ans += calculateMinTime(root, hasApple, c, visited)
        }
        if (curr != 0 && (hasApple[curr] || ans > 0)) {
            ans += 2
        }
        return ans
    }
}


// class Solution {
//     fun minTime(n: Int, edges: Array<IntArray>, hasApple: List<Boolean>): Int {
//         val hm = HashMap<Int, ArrayList<Int>>()
//         for (i in edges.indices) {
//             val parent = edges[i][0]
//             val child = edges[i][1]
//             hm[parent] = hm.getOrDefault(parent, ArrayList<Int>())
//             hm[parent]!!.add(child)
//         }
//         // do an in-order traversal
//         return dfs(0, hm, hasApple)
//         // return path count like in an LCA
//     }
//     fun dfs(node: Int,
//             hm: HashMap<Int, ArrayList<Int>>, 
//             hasApple: List<Boolean>): Int {
//         if (!hm.containsKey(node)) return 0
//         print("$node ")
//         print(hm[node])
//         println()
//         var sum = 0
//         for (n in hm[node]!!) {
//             sum += dfs(n, hm, hasApple)           
//         }
//         if (sum > 0) return sum
//         if (hasApple.get(node)) return 1
//         else return 0
//     }
// }