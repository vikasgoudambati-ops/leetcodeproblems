
class Solution {
    public String truncateSentence(String s, int k) {
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)==' '){
                 k--;
                 if(k==0) break;
            }
            i++;
        }
        return s.substring(0,i);
    }
}