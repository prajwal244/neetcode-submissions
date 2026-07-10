class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> check = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int k=target-nums[i];
            if(check.containsKey(k)){
                return new int[]{check.get(k),i};
            }
            check.put(nums[i],i);
        }
        return new int[]{};
    }
}
