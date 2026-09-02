class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else if(s.charAt(i)==')'){
                if(!st.isEmpty()) st.pop();
                else sb.setCharAt(i,'#');
            }
        }
        while(!st.isEmpty()){
            sb.setCharAt(st.pop(),'#');
        }
        StringBuilder ans = new StringBuilder();
        for(char c:sb.toString().toCharArray()){
            if(c!='#') ans.append(c);
        }
        return ans.toString();
    }
}