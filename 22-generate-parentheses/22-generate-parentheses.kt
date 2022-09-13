class Solution {
    
    fun generateParenthesis(n: Int): List<String> {
        val lst = mutableListOf<String>()
        backtrack(lst, "", 0, 0, n * 2)      
        return lst.toList()
    }
    fun backtrack(lst: MutableList<String>, a: String, open: Int, closed: Int, max: Int) {
        if (a.length >= max) {
            lst.add(a)
        }
        
        if (open < max/2) {
            backtrack(lst, "$a(", open+1, closed, max)
        }
        if (closed < open) {
            backtrack(lst, "$a)", open, closed+1, max)
        } 
    }
}