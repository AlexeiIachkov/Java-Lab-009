/**
 * @author Trevor Hartman
 * @author Alexei Iachkov
 * @date 3-31-24
 * @version 1.0
 */
public class StringPlayground {

    public static int countParentheses(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String testyString1 = "((3 + 7) * 2)";
        String testyString2 = "()())))";
        String testyString3 = "(()(()()(())))";
        String testyString4 = "((()))))";

        System.out.println("Parentheses count for String1: " + countParentheses(testyString1));
        System.out.println("Parentheses count for String2: " + countParentheses(testyString2));
        System.out.println("Parentheses count for String3: " + countParentheses(testyString3));
        System.out.println("Parentheses count for String4: " + countParentheses(testyString4));
    }
}

//this code can be generalized more by adding more specific parameters such as other brackets and using true/false instead of integers