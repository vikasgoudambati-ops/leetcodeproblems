class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        List<Character>[] bucket = new ArrayList[s.length() + 1];

        for (char c = 0; c < 128; c++) {
            if (freq[c] > 0) {
                if (bucket[freq[c]] == null) {
                    bucket[freq[c]] = new ArrayList<>();
                }
                bucket[freq[c]].add(c);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int f = s.length(); f >= 1; f--) {
            if (bucket[f] != null) {
                for (char c : bucket[f]) {
                    for (int i = 0; i < f; i++) {
                        ans.append(c);
                    }
                }
            }
        }

        return ans.toString();
    }
}