class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            if (word.length() >= 3) {
                ans.append(Character.toUpperCase(word.charAt(0)));
                ans.append(word.substring(1));
            } else {
                ans.append(word);
            }

            ans.append(" ");
        }

        return ans.toString().trim();
    }
}