class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        return binarySearch(l,r,nums,target);
    }
    // helper function because binarySearch is a recursive algorithm
    public int binarySearch(int l, int r, int[] nums, int target) {
        while (l <= r) {
            int m = (l+r)/2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] < target) {
                l = m + 1;
                binarySearch(l, r, nums, target);
            } 
            if (nums[m] > target) {
                r = m-1;
                binarySearch(l, r, nums, target);
            }
        }

        return -1;
    }
}
