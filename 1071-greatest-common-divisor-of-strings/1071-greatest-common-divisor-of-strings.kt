class Solution { 

    public fun gcdOfStrings(str1: String, str2: String): String {
        if (!(str1+str2).equals(str2+str1))  return ""

        val gcdVal = gcd(str1.length , str2.length)
        return str2.substring(0, gcdVal)
    }

    public fun gcd(p: Int, q: Int): Int {
        if (q == 0) return p
        else return gcd(q, p % q)
    }
}