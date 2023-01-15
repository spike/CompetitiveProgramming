class Solution {
    fun numberOfGoodPaths(vals: IntArray, edges: Array<IntArray>): Int {
        edges.sortBy { Math.max(vals[it[0]], vals[it[1]]) }
        val uf = UF(vals)
        var goodPaths = vals.size
        for ((v1, v2) in edges) {
            goodPaths += uf.union(v1, v2)
        }
        return goodPaths
    }

    private class UF(vals: IntArray) {
        val parent = IntArray(vals.size) { it }
        val maxValues = IntArray(vals.size) { vals[it] }
        val counts = IntArray(vals.size) { 1 }

        fun find(child: Int): Int {
            if (parent[child] == child) return child
            val leader = find(parent[child])
            parent[child] = leader
            return leader
        }

        fun union(child1: Int, child2: Int): Int {
            val p1 = find(child1)
            val p2 = find(child2)
            if (p1 == p2) return 0

            var newPaths = 0
            if (maxValues[p1] == maxValues[p2]) {
                newPaths = counts[p1] * counts[p2]
                counts[p2] += counts[p1]
            } else {
                if (maxValues[p1] > maxValues[p2]) {
                    maxValues[p2] = maxValues[p1]
                    counts[p2] = counts[p1]
                }
            }
            parent[p1] = p2
            return newPaths
        }

    }
}