class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        Set<List<Integer>> seen=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            Set<Integer>check=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int k=0-(nums[i]+nums[j]);
                if(check.contains(k)){
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],k);
                    seen.add(temp);
                }
                check.add(nums[j]);
            }
        }
        result.addAll(seen);
        return result;
        
    }
}
