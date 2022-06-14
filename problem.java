class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length == 0) return 0;
        
        Stack<Integer> s = new Stack();
        int result = 0;
        
        for(int i = 0; i < tokens.length; i++){
            String temp = tokens[i];
            if(temp.equals("+")){
                    int t1 = s.pop();
                    int t2 = s.pop();
                    result = t2 + t1;
                    s.push(result);
            }
            else if(temp.equals("-")){
                int t1 = s.pop();
                int t2 = s.pop();
                result = t2 - t1;
                s.push(result);
            }
            else if(temp.equals("*")){
                int t1 = s.pop();
                int t2 = s.pop();
                result = t2 * t1;
                s.push(result);
            }
            else if(temp.equals("/")){
                int t1 = s.pop();
                int t2 = s.pop();
                result = t2 / t1;
                s.push(result);
            }
            else{
                s.push(Integer.parseInt(temp));
            }
        }
        return s.pop();
    }
}
//time complexity O(n)
//space complexity O(n) where n is length of given string array