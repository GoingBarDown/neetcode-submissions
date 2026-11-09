class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False 

        # we could create 2 empty arrays size of alphabet; add character
        # counts for each string. compare each array and return F or T

        tCount = [0] * 26
        sCount = [0] * 26

        for i in range(len(s)):
            sCount[ord(s[i]) - ord('a')] += 1
            tCount[ord(t[i]) - ord('a')] += 1
        return sCount == tCount

        