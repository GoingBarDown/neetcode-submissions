class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        numset = {}

        for dig in nums:
            numset[dig] = 1 + numset.get(dig, 0)
        
        arr = []
        for num, cnt in numset.items():
            arr.append([cnt, num])
        
        arr.sort()

        res = []
        while len(res) < k:
             res.append(arr.pop()[1]) 
        return res           