class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> unique=new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> temp=Arrays.asList(nums[i], nums[j], nums[k]);
                    unique.add(temp);
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }
            }
        }
        result.addAll(unique);
        return result;
    }
}
