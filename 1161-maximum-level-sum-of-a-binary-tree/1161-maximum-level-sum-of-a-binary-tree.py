# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        q = []
        q.append(root)
        maxSum = -10**5 -1
        maxLevel = 1
        level = 0
        while q:
            level += 1
            levelSum = 0
            size = len(q)
            for i in range(size):
                node = q.pop(0)
                levelSum += node.val
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            if maxSum < levelSum:
                maxSum = levelSum
                maxLevel = level
        return maxLevel
            
        