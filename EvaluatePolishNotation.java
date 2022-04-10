// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Create a stack of Integer type and iterate over tokens.
// If we see an oprand convert it to integer and push in the stack
// If we see an operator we pop two elements from the stack and perform the operator
// and agiain push the result to the stack
// Finally we will return the top of the stack
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            String cur = tokens[i];
            //check for operator
            if(cur.equals("+") || cur.equals("-") || cur.equals("*") ||cur.equals("/")){
                int oper2 = st.pop();
                int oper1 = st.pop();
                if(cur.equals("+")){
                    st.push(oper1+oper2);
                }
                else if(cur.equals("*")){
                    st.push(oper1*oper2);
                }
                else if(cur.equals("-")){
                    st.push(oper1-oper2);
                }
                else {
                    st.push(oper1/oper2);
                }   
            }
            else{
                int operand = Integer.parseInt(cur);
                st.push(operand);
            }
        }
        return st.pop();
    }
}