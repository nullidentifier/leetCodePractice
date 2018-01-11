class Solution {
    public boolean isValid(String s) {
       
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            switch(c){
                case '(':st.push(')');
                    break;
                case '[':st.push(']');
                    break;
                case '{': st.push('}');
                    break;
                case')': case'}': case']':if(st.isEmpty() || st.pop()!=c) return false;
            }
        }
        return st.isEmpty();
    }