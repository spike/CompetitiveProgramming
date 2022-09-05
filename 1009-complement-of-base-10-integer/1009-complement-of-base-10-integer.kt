class Solution {
    fun bitwiseComplement(num: Int): Int {
        if (num == 0) return 1
        var n = num
        var v = 0
        var comp = 0
        val stack = Stack<Int>()
        while (n != 0) {
            v = if (n % 2 == 1) 0 else 1
            n = n shr 1
            stack.push(v)
        }
        while (!stack.isEmpty()) {
            comp += stack.pop()
            if (!stack.isEmpty()) comp *= 2
        }
        return comp
    }
}