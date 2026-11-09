class Solution:
    d = {}
    d[0] = 1
    d[1] = 1
    def climbStairs(self, n: int) -> int:
        if n not in self.d:
            self.d[n] = self.climbStairs(n-2) + self.climbStairs(n-1)
        return self.d[n]
        