class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int a1[]=new int [2*n];
        for(int i=0;i<n;i++){
            a1[i]=nums[i];
            a1[i+n]=nums[i];
        }
        return a1;
    }
}