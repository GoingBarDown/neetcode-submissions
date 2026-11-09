# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def lowestCommonAncestor(self, root: TreeNode, p: TreeNode, q: TreeNode) -> TreeNode:
        if not root or not p or not q:
            return None

        curr = root
        while curr:
            if p.val < curr.val < q.val or q.val < curr.val < p.val:
                return curr
            elif curr.val == p.val or curr.val == q.val:
                break
            elif max(p.val, q.val) < curr.val:
                curr = curr.left
            elif min(p.val, q.val) > curr.val:
                curr = curr.right
        return curr
        