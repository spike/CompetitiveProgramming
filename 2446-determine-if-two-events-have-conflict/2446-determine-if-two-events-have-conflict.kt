class Solution {
    fun haveConflict(event1: Array<String>, event2: Array<String>): Boolean {
        val start1 = convert(event1[0])
        val start2 = convert(event2[0])
        val end1 = convert(event1[1])
        val end2 = convert(event2[1])
        val arr = Array(24*60) {false}
        for (i in start1..end1) {
            arr[i] = true
        }
        for (i in start2..end2) {
            if (arr[i] == true) return true
        }
        return false
    }
    fun convert(time: String): Int {
        val h = (time[0].toString() + time[1].toString() + "").toInt() * 60
        val m = (time[3].toString() + time[4].toString() + "").toInt()
        if (h == 0) return m
        if (m == 0) return h
        return h + m
    }
}