class Solution { /*
"00110011"
 ----
  --
   ----
    --
      ----
       --
*/
    fun countBinarySubstrings(s: String): Int {
        var previousRun = 0; var currentRun = 1
        var count = 0
        for (i in 1..s.lastIndex) {
            if (s[i] == s[i-1]) {
                currentRun++
            } else {
                previousRun = currentRun
                currentRun = 1
            }
            if (currentRun <= previousRun) count++
        }
        return count
    }
}