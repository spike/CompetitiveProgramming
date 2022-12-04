class Solution {
    fun dividePlayers(skill: IntArray): Long {
        skill.sort()
        var left = 0; var right = skill.lastIndex
        var ideal: Long = skill[left] + skill[right] + 0L
        var sum: Long = 0L
        while (left < right) {
            val totalSkill: Long = skill[left] + skill[right] + 0L
            val chem: Long = skill[left] * skill[right] * 1L
            if (ideal != totalSkill) return -1L
            sum += chem
            left++
            right--
        }
        return sum
    }
}