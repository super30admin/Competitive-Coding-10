// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Create a stack and iterate over characters in num
// if the next character is larger then keep pushing it in stack
// if the top of stack is less that the next character pop from stack
// and push the char to stack, and decrement k value
// Now if k is 0 we can stop. Add the remaining substring to answer string
// Pop all the characters from the stack and add to the answer string
// Now return the answer string. If it is empty return "0"
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        for(i = 0; i < num.length(); i++){
            if(k == 0)
                break;
            char c = num.charAt(i);
            if(st.isEmpty()){
                st.push(c);
            }
            else{
                if( k > 0 && st.peek() > c){
                    st.pop();
                    k--;
                    i--;
                }
                else{
                    st.push(c);
                }       
            }
        }
        while(k != 0){
            st.pop();
            k--;
        }
        StringBuilder str = new StringBuilder();
        str.append(num.substring(i,num.length()));
        while(!st.isEmpty()){
            str.insert(0,st.pop());
        }
        while(str.length() !=0 && str.charAt(0) == '0'){
            str.deleteCharAt(0);
        }
        if(str.length() == 0)
            return "0";
        return str.toString();
    }
}