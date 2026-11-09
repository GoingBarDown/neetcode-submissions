class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            smap.putIfAbsent(s.charAt(i), 1);
            tmap.putIfAbsent(t.charAt(i), 1);

            smap.replace(s.charAt(i), smap.get(s.charAt(i)) + 1);
            tmap.replace(t.charAt(i), tmap.get(t.charAt(i)) + 1);
        }

        if (tmap.equals(smap)) {
            return true;
        } else {
            return false;
        }

    }
}
