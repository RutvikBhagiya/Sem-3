// 47.Write a program for evalution of postfix Expression using stack
import java.util.*;

class EvaluationPost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a postfix expression: ");
        String exp = sc.nextLine();
        System.out.println("Evaluation of your postfix expression is: " + evaluate(exp));
    }

    public static int evaluate(String myexp) {
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<myexp.length(); i++) {
            char mychar = myexp.charAt(i);

            if(Character.isWhitespace(mychar)){
                continue;
            }

            if (Character.isDigit(mychar)) {
                int digit = (int)(mychar - '0');
                stack.push(digit);
            } 
            else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int ans = 0;

                switch (mychar) {
                    case '+':
                        ans = operand1 + operand2;
                        break;
                    case '-':
                        ans = operand1 - operand2;
                        break;
                    case '*':
                        ans = operand1 * operand2;
                        break;
                    case '/':
                        ans = operand1 / operand2;
                        break;
                    case '^':
                        ans = (int) Math.pow(operand1, operand2);
                        break;
                    default:
                        System.out.println("Invalid character encountered: " + mychar);
                        return -1;
                }
                stack.push(ans);
            }
        }
        return stack.pop();
    }
}
