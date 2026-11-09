class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        check = set(nums)
        max_length = 0

        for n in nums:
            if (n-1) not in check:
                length = 0
                while (n + length) in check:
                    length += 1
                max_length = max(max_length, length)
        return max_length
         

         # 2 3 4 4 5 10 20