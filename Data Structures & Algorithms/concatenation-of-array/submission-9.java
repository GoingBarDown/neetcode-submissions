class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int finalLength = length*2;
        int[] arr = new int[finalLength];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i+length] = nums[i];
        }
        return arr;
    }
}