class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=0,count=0;
        for(int j=0;j<n;j++){
            if(nums[j]==1){
               count++;
               max=Math.max(max,count);
            }
           else{
            count=0;
           }
        }
        return max;
    }
}