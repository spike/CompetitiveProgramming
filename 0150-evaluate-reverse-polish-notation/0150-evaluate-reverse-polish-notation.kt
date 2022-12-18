
/* 4 + 13/5
["10","6","9","3","+","-11","*","/","*","17","+","5","+"]


3
9
6
10
I need to take into account negative numbers
*/
class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()
        for(token in tokens) {
            if (!isOperator(token)) {
                stack.push(token.toInt())
            } else {
                var res = 0
                val b = stack.pop()
                val a = stack.pop()
                when (token) {
                    "+" -> res = a + b
                    "/" -> res = a / b
                    "-" -> res = a - b
                    else -> res = a * b
                }
                stack.push(res)
            }
        }
        if (stack.size == 1) return stack.pop()
        else return 0
    }
    fun isOperator(s: String): Boolean {
        return (s in arrayOf("+","/","*","-"))
    }
}