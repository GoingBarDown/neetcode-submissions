class Solution:
    def findMin(self, nums: List[int]) -> int:
        l, r = 0, len(nums)-1
        res = nums[0]

        while l < r:
            m = (l+r-1) // 2
            if nums[m] < nums[r]:
                r = m
            elif nums[m] > nums[r]:
                l = m+1
        return nums[r]

        [3, 4, 5, 1, 2]
