// 47.Write a program for evalution of postfix Expression using stack

import java.util.*;

class EvaluationPre{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Prefix Expression : ");
        String exp = sc.nextLine();
        System.out.println("Evaluate exp of Prefix is : "+evaluatePre(exp));
    }

    public static int evaluatePre(String myexp){
        Stack<Integer> stack = new Stack<>();
           for (int i=myexp.length()-1; i>=0; i--) {
            char mychar = myexp.charAt(i);

            if(Character.isWhitespace(mychar)){
                continue;
            }

            if (Character.isDigit(mychar)) {
                int digit = (int)(mychar - '0');
                stack.push(digit);
            } 
            else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
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
                        ans = (int) Math.pow(operand1,operand2);
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
