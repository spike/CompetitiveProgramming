class Solution {
    fun sortTheStudents(score: Array<IntArray>, k: Int): Array<IntArray> {
        score.sortWith (Comparator { a, b ->
            b[k].compareTo(a[k])
        })
        return score
    }
}