class Solution {
    fun distinctIntegers(n: Int): Int {
        val hs = HashSet<Int>()
        helper(n, hs)
        return hs.size + 1
    }
    fun helper(n: Int, hs: HashSet<Int>) {
        if (n < 2) return
        val i = n - 1
        if (n % i == 1) {
            hs.add(i)
            helper(i, hs)
        }
        return
    }
}