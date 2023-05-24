class Solution {
    fun openLock(deadends: Array<String>, target: String): Int {
        val visited = HashSet<String>()
        val q: Queue<Pair<String, Int>> = LinkedList<Pair<String, Int>>()
        for (combination in deadends) {
            visited.add(combination)
        }
        q.add(Pair("0000", 0))
        while (q.isNotEmpty()) {
            val (n, turns) = q.remove()
            if (n in visited) continue
            if (n.equals(target)) return turns
            visited.add(n)
            for (i in 0..3) {
                val (a, b) = gen(i, n)
                if (a !in visited) q.add(Pair(a, turns+1))
                if (b !in visited) q.add(Pair(b, turns+1))
            }
        }
        return -1        
    }
    fun gen(i: Int, n: String): Pair<String, String> {
        val sb1 = StringBuilder()
        val sb2 = StringBuilder()
        for (j in 0..3) {
            if (i == j) {
                sb1.append(up(n[j]))
                sb2.append(down(n[j]))
            } else {
                sb1.append(n[j])
                sb2.append(n[j])
            }
        }
        return Pair(sb1.toString(), sb2.toString())
    }
    fun up(d: Char): Char {
        return when (d) {
                '9' -> '0'
                else -> d + 1
            }
    }
    fun down(d: Char): Char {
        return when (d) {
                '0' -> '9'
                else -> d - 1
            }
    }
}