class Solution:

    def encode(self, strs: List[str]) -> str:

        encoded_str = ''
        for s in strs:
            encoded_str += str(len(s)) + '#' + s
        
        return encoded_str

        # loop through the string, when there is a hashtag and a number beside it, scan # of digits to 
        # right of hashtag and add to next index of list
        # 5#Hello5#World
        #   i    j
    def decode(self, s: str) -> List[str]:

        res = []
        i = 0 # i is digit (len of str)

        while i < len(s):
            j = i
            while s[j] != '#':
                j += 1 # j is next number. [] is incluzive exclusive to go 
                        # from i to j
            length = int(s[i:j]) 
            i = j + 1
            j = i + length
            res.append(s[i:j])
            i = j
        return res

            


