class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
           char[] c_arr = str.toCharArray();
           Arrays.sort(c_arr);
           String sortedS = new String(c_arr);
           map.putIfAbsent(sortedS, new ArrayList<String>());
           map.get(sortedS).add(str);
        }

        return new ArrayList<>(map.values());
        
    }
}
