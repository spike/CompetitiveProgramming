class Solution {
    fun isHappy(n: Int): Boolean {
        var attempts = 1000
        var num = n
        while (attempts > 0 && num != 1) {
            var total = 0
            while (num > 0) {
                total += (num % 10) * (num % 10)
                num /= 10
            }
            num = total
            attempts--
        }
        return (num == 1) 
    }
}