class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        if (x == 0) return true
        val lst = ArrayList<Int>()
        var n = x
        while (n > 0) {
            lst.add(n % 10)
            n /= 10
        }
        for (i in 0..lst.lastIndex/2) {
            if (lst[i] != lst[lst.lastIndex-i]) return false
        }
        return true
    }
}