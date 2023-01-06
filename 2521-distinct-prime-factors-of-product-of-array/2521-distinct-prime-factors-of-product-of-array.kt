class Solution {
    val allPrimes = Array(1001) { true }
    val primes = ArrayList<Int>()
    fun generatePrimes(n: Int) {
        allPrimes[0] = false
        allPrimes[1] = false
        for (i in 2..n) {
            if (allPrimes[i] == true) {
                for (j in i+i..n step i) {
                    allPrimes[j] = false
                }
            }
        }
        for (i in allPrimes.indices) {
            if (allPrimes[i]) primes.add(i)
        }
    }
    fun distinctPrimeFactors(nums: IntArray): Int {
        var res = HashSet<Int>()
        if (allPrimes[0]) generatePrimes(1000)
        
        for (n in nums) {
            for (m in primes) {
                if (n % m == 0) res.add(m)
            }
        }
        return res.size
    }
}