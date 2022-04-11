import java.util.Stack;
/*
Time Complexity: O(N), N is the number of strings in the tokens array
Space Complexity: O(N), N is the size of Stack
Run on leetcode: Yes
Any difficulties: No

Approach:
1. Using Number stack and pushing number into it, until I encounter an operator I am not gonna pop number from the stack
once operator is encounter, then I will be popping out the top two elements from the stack
 */
public class EvaluateReversePolishNotation {

    public static int evaluateRPN(String[] tokens){
        // Edge Condition

        if(tokens.length == 0 || tokens == null){
            return -1;
        }

        // Operator String
        String operators = "+-*/";
        // Stack
        Stack<Integer> numberStack = new Stack<>();

        // Iterate over the tokens String array
        for(String token: tokens){
            if(!operators.contains(token)){
                 numberStack.push(Integer.parseInt(token));
            }else{
                int a = numberStack.pop();
                int b = numberStack.pop();

                if(token.equals("+")){
                    numberStack.push(b+a);
                }else if(token.equals("-")){
                    numberStack.push(b-a);
                }else if(token.equals("*")){
                    numberStack.push(b*a);
                }
                else if(token.equals("/")){
                    numberStack.push(b/a);
                }
            }
        }
        return numberStack.peek();
    }

    public static void main(String[] args){
        String[] tokens = {"2","1","+","3","*"};
        String[] tokens1 = {"4","13","5","/","+"};
        String[] tokens2 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println("Reverse Polish Notation: "+ evaluateRPN(tokens));
        System.out.println("Reverse Polish Notation: "+ evaluateRPN(tokens1));
        System.out.println("Reverse Polish Notation: "+ evaluateRPN(tokens2));
    }
}
