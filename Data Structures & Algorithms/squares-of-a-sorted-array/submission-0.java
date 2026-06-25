class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int k = nums.length - 1;
        int result[] = new int[nums.length];
        while (left <= right) {
            int leftsquared = nums[left] * nums[left];
            int rightsquared = nums[right] * nums[right];
            if (leftsquared > rightsquared) {
                result[k] = leftsquared;
                left++;
            } else {
                result[k] = rightsquared;
                right--;
            }
            k--;
        }
        return result;
    }
}