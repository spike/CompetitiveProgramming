class Solution {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        people.sort()
        var left = 0; var right = people.lastIndex
        var count = 0
        while (left <= right) {
            if (left != right && 
                limit - people[right] >= people[left]) left++
            right--
            count++
        }
        return count
    }
}