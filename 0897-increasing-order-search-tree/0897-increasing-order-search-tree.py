# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def increasingBST(self, root: TreeNode) -> TreeNode:
        head = TreeNode()
        curr = head
    
        def dfs(node: TreeNode) -> TreeNode:
            nonlocal curr
            if not node:
                return None
            
            dfs(node.left)
            curr.right = TreeNode(node.val)
            curr = curr.right
            dfs(node.right)
            return None
        dfs(root)
        
        return head.right