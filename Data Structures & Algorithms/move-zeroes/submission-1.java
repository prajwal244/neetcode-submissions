class Solution {
    public void moveZeroes(int[] nums) {
        int k=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                k=i;
                break;
            }
        }
        if(k==-1)return;
        for(int j=k+1;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                k++;
            }
        }

        
    }
}