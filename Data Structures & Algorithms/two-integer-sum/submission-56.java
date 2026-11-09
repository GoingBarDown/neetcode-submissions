class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int f = 0;
        int l = nums.length-1;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
// nums = [3,4,5,6], target = 7
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (map.containsKey(difference) && map.get(difference) != i) {
                return new int[]{i, map.get(difference)};
            }
        }
        return new int[2];
    }
}
