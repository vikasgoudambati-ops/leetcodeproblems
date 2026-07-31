class Solution {
    public int minOperations(String s) {
        int startWith0 = 0;
        int startWith1 = 0;

        for (int i = 0; i < s.length(); i++) {

            char expected0;
            char expected1;

            if (i % 2 == 0) {
                expected0 = '0';
                expected1 = '1';
            } else {
                expected0 = '1';
                expected1 = '0';
            }

            if (s.charAt(i) != expected0) {
                startWith0++;
            }

            if (s.charAt(i) != expected1) {
                startWith1++;
            }
        }

        if (startWith0 < startWith1) {
            return startWith0;
        } else {
            return startWith1;
        }
    }
}