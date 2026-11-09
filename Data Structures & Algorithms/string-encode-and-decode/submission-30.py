class Solution:

    def encode(self, strs: List[str]) -> str:
        string = ''
        for n in strs:
            string += str(len(n)) + '#' + n
        return string
 

    def decode(self, s: str) -> List[str]:
        i = 0
        res = []
        while i < len(s):
            j = i
            while s[j] != '#':
                j += 1

            length = int(s[i:j])
            i = j + 1
            j = i + length

            res.append(s[i:j])
            i = j
        return res

        # 5#World
        #   i
        #        j



        # 3#bob5#likes7#burgers
        #   i
        #      j

