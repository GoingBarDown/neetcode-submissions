class Solution {
        public boolean isPalindrome(String s) {
        int f = 0;
        int l = s.length() - 1;

        while (f <= l) {
            // Move front pointer forward if not alphanumeric
            while (f < l && !Character.isLetterOrDigit(s.charAt(f))) {
                f++;
            }

            // Move back pointer backward if not alphanumeric
            while (f < l && !Character.isLetterOrDigit(s.charAt(l))) {
                l--;
            }

            // Compare lowercase versions
            if (Character.toLowerCase(s.charAt(f)) != Character.toLowerCase(s.charAt(l))) {
                return false;
            }

            f++;
            l--;
        }
        return true;
    }
}
