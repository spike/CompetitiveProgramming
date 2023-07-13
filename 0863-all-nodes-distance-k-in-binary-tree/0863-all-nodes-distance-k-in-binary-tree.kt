/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun distanceK(root: TreeNode?, target: TreeNode?, k: Int): 
    List<Int> {
         val parent = HashMap<Int, TreeNode?>()
         dfs(root, parent)
         val lst = ArrayList<Int>()
         if (target == null || root == null) return lst
         val q: Queue<Pair<TreeNode, Int>> = LinkedList<Pair<TreeNode, Int>>()
         q.add(Pair(target, 0))
         val visited = HashSet<TreeNode>()
         
         while (q.isNotEmpty()) {
             val (node, order) = q.remove()
             if (visited.contains(node)) continue
             visited.add(node)
             val n = node.`val`
             if (order == k) {
                 lst.add(n)
                 continue
             }
             if (parent.containsKey(n) && parent[n] != null) {
                 q.add(Pair(parent[n]!!, order+1))
             }
             node.left?.let {
                 q.add(Pair(node.left!!, order+1))
             }
             node.right?.let {
                 q.add(Pair(node.right!!, order+1))
             }   
         }
         return lst
    }
    fun dfs(root: TreeNode?, parent: HashMap<Int,TreeNode?>) {
        if (root == null) return
        root.left?.let { 
            parent[it.`val`] = root
            dfs(root.left, parent)
        }
        root.right?.let { 
            parent[it.`val`] = root
            dfs(root.right, parent)
        }
        return
    }
}