class Solution {
    public boolean isIsomorphic(String s, String t) {

        int[] freqS = new int[256];
        int[] freqT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (freqS[a] != freqT[b]) {
                return false;
            }
            freqS[a] = i + 1;
            freqT[b] = i + 1;
        }

        return true;
    }
}