class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
    Set<List<Integer>> uniqueList = new HashSet<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      int j = i + 1;
      int k = nums.length - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == 0) {
          List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
          uniqueList.add(temp);
          j++;
          k--;
          while (j < k && nums[j] == nums[j - 1]) j++;
          while (j < k && nums[k] == nums[k + 1]) k--;
        } else if (sum > 0) {
          k--;
        } else {
          j++;
        }
      }
    }
    result.addAll(uniqueList);
    return result;
    }
}
