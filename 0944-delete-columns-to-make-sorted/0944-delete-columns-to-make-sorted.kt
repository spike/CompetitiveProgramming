class Solution {
    fun minDeletionSize(strs: Array<String>): Int {
        var count = 0
        for (x in strs[0].indices) {
            var prev = strs[0][x] // 
            for (y in strs.indices) {
                if (prev.toInt() > strs[y][x].toInt()) {
                    count++
                    break
                } else {
                    prev = strs[y][x] 
                }
            }
        }
        return count
    }
}