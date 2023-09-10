# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findTarget(self, root: Optional[TreeNode], k: int) -> bool:
        hs = set()
        
        def dfs(node: Optional[TreeNode]) -> bool:
            if not node:
                return False
            
            if node.val in hs:
                return True
            hs.add(k-node.val)
            
            return dfs(node.left) or dfs(node.right)
        
        return dfs(root)