class Solution {
    fun isLongPressedName(name: String, typed: String): Boolean {
        val (n1, n2) = huffmanEncode(name) 
        // this returns two stacks (2 deques) n1 and n2
        val (t1, t2) = huffmanEncode(typed)
        // this returns two stacks (2 deques) t1 and t2
        // t1 is the stack of characters and t2 is the stack of counts
        
        while (!n1.isEmpty() && !t1.isEmpty()) {
            // if letter is different return false
            if (n1.pollLast() != t1.pollLast()) return false
            // if count of letter in name > count of letter in typed
            // return false
            if (n2.pollLast() > t2.pollLast()) return false
        }
        return (n1.isEmpty() && t1.isEmpty())
    }
    
    // Huffman encoding means "sssaeed" => 3s,1a,2e,1d
    // but in my case, I'm using two stacks
    // str="sssaeed"   => stackChar = { 's', 'a', 'e', 'd'}
    //                    stackCount= {  3 ,  1 ,  2 ,  1 }
    
    fun huffmanEncode(str: String): 
                Pair<ArrayDeque<Char>,ArrayDeque<Int>> {
        val stackChar = ArrayDeque<Char>()
        val stackCount = ArrayDeque<Int>()
        for (i in str.indices) {
        // if stack is empty or if current letter is not same as last letter
        // add letter and add number to both stacks
            if (stackChar.isEmpty() || str[i] != stackChar.peekLast()) {
                stackChar.addLast(str[i])
                stackCount.addLast(1)
            } else {
                // else letter is same, replace count with count + 1
                stackCount.addLast(stackCount.pollLast() + 1)
            }
        }
        return Pair(stackChar, stackCount)
    }
}