class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = {}
        res = []

        for n in nums:
            map[n] = 1 + map.get(n, 0)

        arr = []
        for num, cnt in map.items():
            arr.append([cnt, num])
        arr.sort()

        while len(res) < k:
            res.append(arr.pop()[1])
            
        return res




