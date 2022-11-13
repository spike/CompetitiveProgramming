class Solution {
    fun reverseWords(s: String): String {
        val stack = Stack<String>()
        val sb = StringBuilder()
        
        for (c in s) {
            if (c == ' ') {
                if (sb.length > 0) stack.push(sb.toString())
                sb.clear()
            } else {
                sb.append(c)
            }
        }
        if (sb.length > 0) stack.push(sb.toString())
        sb.clear()
        while (!stack.isEmpty()) {
            sb.append(stack.pop())
            sb.append(' ')
        }
        return sb.toString().trim()
    }
}