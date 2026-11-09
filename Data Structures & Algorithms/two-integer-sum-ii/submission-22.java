class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indexes = new int[0];
        int l = 0;
        int r = numbers.length-1;
        while (l < r) {
            if (target > numbers[l]+numbers[r]) {
                l++;
            } else if (target < numbers[l] + numbers[r]) {
                r--;
            } else {
                return new int[] {l+1, r+1};
            }
        }
        return indexes;
    }
}

// 2 4 6 8.   target = 6
