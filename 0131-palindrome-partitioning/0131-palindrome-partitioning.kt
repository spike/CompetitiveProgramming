class Solution {
    fun partition(s: String): List<List<String>> {
        val size = s.length
        val part = mutableListOf<String>()
        val res = mutableListOf<List<String>>()     

        tailrec fun isPalindrome(l: Int, r: Int): Boolean {
            if (l >= r) return true
            return s[l] == s[r] && isPalindrome(l + 1, r - 1)
        }

        fun dfs(i: Int) {
            if (i >= size) { res += part.toList(); return }
            
            for (j in i until size) {
                if (!isPalindrome(i, j)) continue
                part += s.substring(i, j + 1)
                dfs(j + 1)
                part.removeAt(part.size - 1)
            }
        }

        dfs(0)
        return res
    }        
} 

// class Solution {
//     val memo = HashMap<String, Boolean>() 
    
//     fun partition(s: String): List<List<String>> {
//         val res = ArrayList<List<String>>()
//         for (i in 1..s.lastIndex) {
//             helper(s, res, i, s.lastIndex)
//         }
//         return res
//     }
//     fun helper (s: String, res: List<List<String>>,
//                 i: Int, j: Int) {
//         if (i >= j) return
//         if (!isPalindrome(s.slice(0..i))) return
//         if (!isPalindrome(s.slice(i-1..j)) return
//         listOf(s.slice(0..i)))
//     }
//     fun isPalindrome(s: String): Boolean {
//         var left = 0; var right = s.lastIndex
//         if (memo.containsKey(s)) {
//             return memo[s]!!
//         }
//         while (left < right) {
//             if (s[left]!! != s[right]!!) {
//                 memo[s] = false
//                 return false
//             }
//             left++
//             right--
//         }
//         memo[s] = true
//         return true
//     }
// }