class Solution {
    fun countSubTrees(n: Int, edges: Array<IntArray>, labels: String): IntArray {

        val graph = Array(n) { mutableListOf<Int>() }
        for (edge in edges) {
            graph[edge[0]].add(edge[1])
            graph[edge[1]].add(edge[0])
        }
        graph[0].add(-1)
        val mutableMap = Array(n) { Array(26) {0} }
        subTreeDfs(0, -1, graph, labels, mutableMap)
        return mutableMap.mapIndexed {index, current -> current[labels[index] - 'a']}.toIntArray()
    }

    private fun subTreeDfs(currentIdx: Int, parentIdx: Int, graph: Array<MutableList<Int>>, labels: String, mutableMap: Array<Array<Int>>) {
        mutableMap[currentIdx][labels[currentIdx] - 'a'] = 1
        if(graph[currentIdx].size == 1) {
            return
        }
        for (edge in graph[currentIdx]) {
            if(edge == parentIdx) continue
            subTreeDfs(edge, currentIdx, graph, labels, mutableMap)
            for(i in 0 until 26) {
                mutableMap[currentIdx][i] += mutableMap[edge][i]
            }
        }
    }
}