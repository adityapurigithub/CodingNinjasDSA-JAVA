/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author Aditya
 */
    import java.util.Stack;

public class z_checkRedundantBracket {
    public static void main(String[] args){
String str="a+(b)+c";
            System.out.println(checkRedundantBrackets(str));
            System.out.println(checkRedundantBrackets1(str));

}


    public static boolean checkRedundantBrackets(String expression) {
        // create a stack of characters
        Stack<Character> st = new Stack<>();
        char[] str = expression.toCharArray();
        // Iterate through the given expression
        for (char ch : str) {

            // if current character is close parenthesis ')'
            if (ch == ')') {
                char top = st.peek();
                st.pop();

                // If immediate pop have open parenthesis '('
                // duplicate brackets found
                boolean flag = true;

                while (top != '(') {

                    // Check for operators in expression
                    if (top == '+' || top == '-'
                        || top == '*' || top == '/') {
                        flag = false;
                    }

                    // Fetch top element of stack
                    top = st.peek();
                    st.pop();
                }

                // If operators not found
                if (flag == true) {
                    return true;
                }
            } else {
                st.push(ch); // push open parenthesis '(',
            }                // operators and operands to stack
        }
        return false;
    }


/*
Time complexity: O(N)
Space complexity: O(N)
where N is the length of the input expression
*/
    private static boolean find(char ch) {
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        }
        return false;
    }
    public static boolean checkRedundantBrackets1(String expression) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < expression.length(); ++i) {
            if (expression.charAt(i) == '(' || find(expression.charAt(i))) {
                stk.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')') {
                boolean hasOperator = false;
                while (!stk.isEmpty() && stk.peek() != '(') {
                    stk.pop();
                    hasOperator = true;
                }
                if (!hasOperator) {
                    return true;
                }
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            }
        }
        return false;
    }
    

    
}
