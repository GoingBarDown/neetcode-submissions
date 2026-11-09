class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference) && map.get(difference) != i) {
                return new int[] {i, map.get(difference)};
            }
        } 
            return new int[0];
    }
}        //0 1 2 3                  3      0
// nums = [3,4,5,6], target = 7     4      1
        //                            5      2
//Output: [0,1]                     6      3