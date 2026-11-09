class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = {}
        # number : freequency
        for n in nums:
            map[n] = 1 + map.get(n, 0)

        b4sort = []
        for val, cnt in map.items():
            b4sort.append([cnt, val])
        b4sort.sort()

        res = []
        while len(res) < k:
            res.append(b4sort.pop()[1])
        return res