import java.util.LinkedList;

/*
Time Complexity: O(N)
Space Complexity: O(N)
Run on leetcode: yes
Any difficulties: no

Approach:
1. I am using  LinkedList data structure as a digitsStack and storing elements in it at the last, and removing characters
if character is greater than it's right character
 */
public class RemoveKDigits {
    public static String removeKDigits(String num, int k){
        LinkedList<Character> digitsStack = new LinkedList<>();

        for(char digit: num.toCharArray()){
            while(digitsStack.size()>0 && k>0 && digitsStack.peekLast()>digit){
                digitsStack.removeLast();
                k--;
            }
            digitsStack.addLast(digit);
        }

        for(int i = 0; i<k; i++){
            digitsStack.removeLast();
        }

        StringBuilder leastNumber = new StringBuilder();

        boolean leadingZero = true;

        for(char digit: digitsStack){
            if(leadingZero && digit == '0'){
                continue;
            }
            leadingZero = false;
            leastNumber.append(digit);
        }

        if(leastNumber.length() == 0){
            return "0";
        }
        return leastNumber.toString();
    }

    public static void main(String[] args){
        System.out.println("Least Number after removal of digits: "+removeKDigits("1432219", 3));
    }
}
