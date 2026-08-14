class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        int max=0;
        for(int right=0;right<s.length();right++){
            if(isVowel(s.charAt(right))){
                count++;
            }
            if(right>=k){
                if(isVowel(s.charAt(right-k))){
                    count--;
                }
            }
            if(right>=k-1){
                max=Math.max(max,count);
            }
        }
        return max;
    }
    public boolean isVowel(char a){
        return a=='a'||a=='e'||a=='i'||a=='o'||a=='u';
    }
}