class Solution {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        val pq = PriorityQueue<IntArray>(Comparator { a, b ->
            if (a[0] == b[0]) {
                a[1].compareTo(b[1])
            } else a[0].compareTo(b[0])
        })
        for (i in mat.indices) {
            var row = mat[i]
            var v = 0
            for (n in row) {
                v += n
            }
            val a = intArrayOf(v, i)
            pq.add(a)
        }
        val arr = IntArray(k)
        for (i in arr.indices) {
            arr[i] = pq.poll()[1]
        }
        return arr
    }
}