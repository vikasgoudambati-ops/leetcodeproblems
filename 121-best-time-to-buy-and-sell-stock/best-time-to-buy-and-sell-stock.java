class Solution {
    public int maxProfit(int[] prices) {
     
// Code here
int minp=prices[0];
int max=0;
for(int i = 1; i<prices.length; i++){
if(prices[i]-minp>max){
max=prices[i]-minp;
}
if(prices[i]<minp){
minp=prices[i];
}
}
return max;  
    }
}