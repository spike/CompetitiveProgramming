class Solution {
    fun isLongPressedName(name: String, typed: String): Boolean {
        val (n1, n2) = chop(name)
        val (t1, t2) = chop(typed)
        while (!n1.isEmpty() && !t1.isEmpty()) {
            if (n1.pollFirst() != t1.pollFirst()) {
                return false
            }
            if (n2.pollFirst() > t2.pollFirst()) {
                return false
            }
        }
        return (n1.isEmpty() && t1.isEmpty())
    }
    fun chop(str: String): Pair<ArrayDeque<Char>,ArrayDeque<Int>> {
        val q1 = ArrayDeque<Char>()
        val q2 = ArrayDeque<Int>()
        
        // if letter is not in q1, add in q1 and add in q2
        // if letter is in q1, removeLast and increment, and addlast
        for (i in str.indices) {
            if (q1.isEmpty() || str[i] != q1.peekLast()) {
                q1.addLast(str[i])
                q2.addLast(1)
            } else {
                q2.addLast(q2.pollLast() + 1)
            }
        }
        return Pair(q1, q2)
    }
}