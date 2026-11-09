class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // end for loop ; since array is sorted, if nums[i] > 0, then the next sums will always be larger
            if (nums[i] > 0) { 
                break; 
            }
            // see if we are iterating over the same element as the previous iteration
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i+1, r = nums.length-1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    while (nums[l] == nums[l-1] && l < r) {
                        l++;
                    }
                }
                
            }
        }
        return res;
    }
}
