class Solution {
    fun isHappy(n: Int): Boolean {
        val hs = HashSet<Int>()
        var num = n
        while (hs.add(num) && num != 1) {
            var total = 0
            while (num > 0) {
                total += (num % 10) * (num % 10)
                num /= 10
            }
            num = total
        }
        return (num == 1) 
    }
}