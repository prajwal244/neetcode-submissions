class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int prefixsum=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
           prefixsum+=nums[i];
           if(map.containsKey(prefixsum-k)){
            count+=map.get(prefixsum-k);
           }
           map.merge(prefixsum,1,Integer::sum);

        }
        return count;
        
    }
}