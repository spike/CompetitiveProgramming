class Solution {
    fun minPartitions(n: String): Int {
        var max = -1
        for (c in n.toCharArray()) {
            max = maxOf(c-'0', max)
            if (max == 9) return 9
        }
        return max
    }
}