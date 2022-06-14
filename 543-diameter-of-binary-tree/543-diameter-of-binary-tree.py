# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    m = 0
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.m = 0
        self.postOrderDFS(root) # height of substree
        return self.m
    
    def postOrderDFS(self, root) -> int:
        if root == None:
            return 0
        left = self.postOrderDFS(root.left)
        right = self.postOrderDFS(root.right)
        
        self.m = max(left+right, self.m)
        
        highestSubtree = max(left, right)
        return highestSubtree + 1
        
        
        