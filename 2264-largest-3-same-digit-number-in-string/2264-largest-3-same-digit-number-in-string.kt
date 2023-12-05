class Solution {
    fun largestGoodInteger(num: String): String {
        var l = '.'
        for (i in 2..num.lastIndex) {
            if ((num[i-2] == num[i-1]) and (num[i-1] == num[i])) {
                if(num[i] > l) l = num[i]
            } 
        }
        if (l == '.') return ""
        else return "$l$l$l"
    }
}