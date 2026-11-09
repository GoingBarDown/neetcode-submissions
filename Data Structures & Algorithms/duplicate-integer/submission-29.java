class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int y = i+1; y < nums.length; y++) {
                if (nums[i] == nums[y]) {
                    return true;
                }
            }
        }
        return false;
    }
}