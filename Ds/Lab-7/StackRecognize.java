// How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a 
// program to solve the above problem.

import java.util.*;

class NewStack{
    char[] myword;
    int top;

    public NewStack(int size) {
        myword = new char[size];
        top = -1;
    }

    public void push(char mychar){
        if(top>=myword.length-1){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            myword[top] = mychar;
            System.out.println("Inserted");
        }
    }
    public char pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            char X = myword[top];
            top--;
            System.out.println("Poped");
            return X;
        }
    }
}

class StackRecognize{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        int length = str.length();

        NewStack stk = new NewStack(length/2);

        int i=0;
        while(i<length/2){
            stk.push(str.charAt(i));
            i++;
        }
        i++;

        boolean isValid = true;
        while(i<length){
            if(stk.pop()!=str.charAt(i)){
                isValid = false;
                break;
            }
            i++;
        }

        if(isValid){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}