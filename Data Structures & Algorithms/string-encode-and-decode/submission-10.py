class Solution:

    def encode(self, strs: List[str]) -> str:
        stri = ""
        for string in strs:
            stri += str(len(string)) + '#' + string
        return stri




    def decode(self, s: str) -> List[str]:
        i = 0
        res = []

        while i < len(s):
            j = i
            while s[j] != '#':
                j += 1
            length = int(s[i:j])
            i = j + 1
            j = j + 1 + length
            res.append(str(s[i:j]))
            i = j
        return res
        
        






# Input: ["we","say",":","yes"]
# String after encode:
       # ["2#we3#say#1:3#yes"]