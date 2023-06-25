/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var lo = 0; var hi = n
        while(hi-lo > 1) {
            val m = lo + (hi-lo)/2
            if (!isBadVersion(m)) lo = m
            else hi = m
        }
        return hi
	}
}