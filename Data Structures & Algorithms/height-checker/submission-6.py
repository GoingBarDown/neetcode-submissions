class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        heightsCopy = heights.copy()
        heightsCopy.sort()
        heightSum = 0
        for h in range(len(heights)):
            if heights[h] != heightsCopy[h]:
                heightSum += 1
        
        return heightSum
        