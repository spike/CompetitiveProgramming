class Solution {
    // See my attached note for explanation
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val t = Array(26) {0}
        for (i in order.indices) {
            val c = order[i]
            t[c-'a'] = i
        }
        for (i in 1..words.lastIndex) {
            if (!words[i-1].isBefore(words[i], t)) return false
        }
        return true
    }
    fun String.isBefore(other: String, t: Array<Int>): Boolean {
        val len = Math.min(this.length, other.length)
        for (i in 0..len-1) {
            if (t[this[i]-'a'] < t[other[i]-'a']) return true
            if (t[this[i]-'a'] > t[other[i]-'a']) return false
        }
        return (this.length <= other.length)
    }
}