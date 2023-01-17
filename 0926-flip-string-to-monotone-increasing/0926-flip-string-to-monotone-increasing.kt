import kotlin.math.min

class Solution {
    fun minFlipsMonoIncr(S: String): Int {
        var flippedOnes = 0
        var sum = S.sumBy { it - '0' }
        var res = Int.MAX_VALUE
        for (i in S.indices) {
            if (S[i] == '0') continue
            val cur = S.length - i - sum
            res = min(res, cur + flippedOnes)
            ++flippedOnes
            --sum
        }
        res = min(res, flippedOnes)
        return res
    }
}