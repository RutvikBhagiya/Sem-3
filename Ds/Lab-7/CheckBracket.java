// Enter No of Test Cases: 4
//  () -----> 1
//  ([)] ----->0
//  ([{}()])[{}] ----->1
//  [{{}] ------> 0

import java.util.Scanner;
import java.util.Stack;


public class CheckBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of test cases: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
        sc.close();
        
        Solution sol = new Solution();
        for (int i = 0; i < n; i++) {
            if (sol.isValid(s[i])) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}