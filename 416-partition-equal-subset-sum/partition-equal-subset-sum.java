class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        boolean[] possible = new boolean[target + 1];
        possible[0] = true;
        
        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                if (possible[i - num]) {
                    possible[i] = true;
                }
            }
        }
        
        return possible[target];
    }
}