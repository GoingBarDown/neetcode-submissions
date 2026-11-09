class Solution:
    def rob(self, nums: List[int]) -> int:          
        if len(nums) == 1:
            return nums[0]
        # need to initialize memoization list
        memo = [0] * len(nums)

        memo[0] = nums[0]
        memo[1] = max(nums[0], nums[1])

        # memoization = recursion but caches results of each state
        for i in range(2, len(nums)):
            memo[i] = max(memo[i-2] + nums[i], memo[i-1])

        return memo[len(nums)-1]


   # 2 9 8 3 6        
   # h h h h h    
        