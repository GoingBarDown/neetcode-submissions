class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        // 3 4 5 6 targ == 7
        for (int i = 0; i < nums.length; i++) {
                int dif = target - nums[i];
                if (map.containsKey(dif) && map.get(dif) != i) {
                    return new int[]{i, map.get(dif)};
                }
            
        }
        return new int[]{};
    }
}
