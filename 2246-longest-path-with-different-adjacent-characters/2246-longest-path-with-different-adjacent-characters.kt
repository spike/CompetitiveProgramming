class Solution {
    fun longestPath(parent: IntArray, s: String): Int {
        val graph = Array(parent.size) { mutableListOf<Int>() }
        var root = -1
        for(p in parent.withIndex()) {
            if(p.value == -1) {
                root = p.index
                continue
            }
            graph[p.value].add(p.index)
        }
        return longestPathDfs(root, graph, s).second
    }

    private fun longestPathDfs(currentIdx: Int, graph: Array<MutableList<Int>>, s: String): Pair<Int, Int> {
        if(graph[currentIdx].size == 0) {
            return Pair(1, 1)
        }
        val childValues = graph[currentIdx].map { child ->
            val childPath = longestPathDfs(child, graph, s)
            val childArm = if(s[child] == s[currentIdx]) 0 else childPath.first
            val childMax = childPath.second
            Pair(childArm, maxOf(childMax, childArm))
        }
        val sortedValues = (childValues + Pair(0, 1)).sortedBy { - it.first }
        val first = sortedValues[0].first
        val second = sortedValues[1].first
        return Pair(first + 1, maxOf(first + second + 1, sortedValues.maxBy { it.second }!!.second))
    }
}