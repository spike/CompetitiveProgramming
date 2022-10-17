class Solution { /*
    ----
      ----
    
    -----
      --
      [1,3],[2,6],
    */
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        // [[1,4],[2,3]]
        intervals.sortWith(Comparator<IntArray> { a, b ->
            if (a[0] == b[0]) {
                a[1].compareTo(b[1])
            } else {
                a[0].compareTo(b[0])  
            }
        })
        val lst = mutableListOf<IntArray>()
        var start = intervals[0][0] // 1
        var end = intervals[0][1] // 4
        for (i in 1..intervals.lastIndex) {
            if (intervals[i][0] <= end) { // 2 <= 4 true
                end = Math.max(intervals[i][1], end)
            } else {
                lst.add(intArrayOf(start, end))
                start = intervals[i][0]
                end = intervals[i][1]
            }
        }
        lst.add(intArrayOf(start, end))
        val arr: Array<IntArray> = Array<IntArray>(lst.size) {intArrayOf()}
        for (i in lst.indices) {
            arr[i] = lst.get(i)
        }
        return arr
    }
}