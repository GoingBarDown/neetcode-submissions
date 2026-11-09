# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        if not root:
            return 0

        def dfs(root, max_so_far):
            if not root:
                return 0

            current = 0
            
            if root.val >= max_so_far:
                current += 1
                max_so_far = root.val

            left = dfs(root.left, max_so_far)
            right = dfs(root.right, max_so_far)
            return current + left + right
        return dfs(root, root.val)



        