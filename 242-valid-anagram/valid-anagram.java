class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char ch1[]=s.toCharArray();
        Arrays.sort(ch1);
        s=new String(ch1);
        char ch2[]=t.toCharArray();
        Arrays.sort(ch2);
        t=new String(ch2);
        return s.equals(t);
    }
}