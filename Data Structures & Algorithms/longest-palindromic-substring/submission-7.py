class Solution:
    def longestPalindrome(self, s: str) -> str:
        if not s:
            return 0
        indL = 0
        maxL = 0

        for i in range(len(s)):
            # Odd numbered strings
            l, r = i, i
            while l >= 0 and r < len(s) and s[l] == s[r]:
                if (r - l + 1) > maxL:
                    indL = l
                    maxL = r - l + 1
                l -= 1
                r += 1

                # ababd
                #  r l
                # indL = 
                # maxL

            # Even numbered strings
            l, r = i, i + 1
            while l >= 0 and r < len(s) and s[l] == s[r]:
                if (r - l + 1) > maxL:
                    indL = l
                    maxL = r - l + 1
                l -= 1
                r += 1
        
        return s[indL : indL + maxL]


