class Solution {
    public int[] twoSum(int[] nums, int target) {
        // loop through the array
        // subtract current element from target
        // look up to see if exists in hashmap

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i); // key, value -> value, index
        }

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (map.containsKey(difference) && i != map.get(difference)) {
               return new int[]{i, map.get(difference)};
            }
        }
        return new int[0];
    }
}











