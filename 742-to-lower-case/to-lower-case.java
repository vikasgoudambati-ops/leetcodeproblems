class Solution {
    public String toLowerCase(String s) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             
            if (Character.isLowerCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch); // Handles non-alphabetic characters if any exist
            }
        }
        
        return result.toString();
        
    }
}

