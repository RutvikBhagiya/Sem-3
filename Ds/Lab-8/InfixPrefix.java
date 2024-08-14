// . Write a program to convert infix notation to prefix notation using stack.


import java.util.*;
public class InfixPrefix{
    public static void main(String[] args){
        String exp = "(a+b^c^d)+(e+f/d)";
        System.out.println("Expression is : "+exp);

        //To convert expression into reverse
        String revexp = "";
        for(int i=exp.length()-1;i>=0;i--){
            if(exp.charAt(i)=='('){
                revexp += ')';
            }
            else if(exp.charAt(i)==')'){
                revexp += '(';
            }
            else{
                revexp += exp.charAt(i);
            }
        }

        System.out.println("Prefix is : "+toConvertPre(revexp));
    }

    public static String toConvertPre(String myexp){
        Stack <Character> stk = new Stack<>();
        String postfix = "";
        stk.push('(');
        myexp += ')';

        for(int i=0;i<myexp.length();i++){
            char mychar = myexp.charAt(i);

            if(isOprand(mychar)){
                postfix+=mychar;
            }

            else if(mychar == '('){
                stk.push(mychar);
            }

            else if(mychar == ')'){
                while(!stk.isEmpty() && stk.peek()!='('){
                    postfix += stk.pop();
                }
                stk.pop();
            }
            
            else{
                while(!stk.isEmpty() && precedence(mychar)<stkprecedence(stk.peek())){
                    postfix += stk.pop();
                }
                stk.push(mychar);
            }
        }

        while(!stk.isEmpty()){
            if(stk.peek()=='('){
                return "Invalid Expression";
            }
            postfix += stk.pop();
        }
        return toReversePost(postfix);
    }

    public static boolean isOprand(char ch){
        return (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9');
    }

    public static String toReversePost(String postexp){
        String prefixexp = "";
        for(int i=postexp.length()-1;i>=0;i--){
            prefixexp += postexp.charAt(i);
        }
        return prefixexp;
    }

    public static int precedence(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static int stkprecedence(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 4;
        }
        return -1;
    }
}