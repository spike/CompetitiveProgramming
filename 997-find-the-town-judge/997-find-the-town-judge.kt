class Solution {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        if (n == 1 && trust.size == 0) return 1
        val person = IntArray(n+1) {0}
        for (t in trust) {
            person[t[0]] = Integer.MIN_VALUE
            person[t[1]]++
        }
        for (i in person.indices) {
            if (person[i] == n-1)
                return i
        }
        return -1
    }
}