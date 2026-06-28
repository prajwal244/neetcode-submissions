class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> checked = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sv = target - nums[i];
            if (checked.containsKey(sv)) {
                return new int[] {checked.get(sv), i};
            }
            checked.put(nums[i], i);
        }
        return new int[] {};
    }
}
