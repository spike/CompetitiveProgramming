/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var l = 1
        var r = n
        var ans = -1
        while(l <= r) {
            var m = l + (r-l)/2
            if (isBadVersion(m)) {
                ans = m
                r = m - 1
            } else {
                l = m + 1
            }
        }
        return ans
	}
}