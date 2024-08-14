// Write a menu driven program to implement following operations on the Stack using an Array
//  PUSH, POP, DISPLAY
//  PEEP, CHANGE

import java.util.*;

class Stack{
    Scanner sc = new Scanner(System.in);
    int top = -1;
    int arsize = 5;
    int stack[] = new int[arsize];

    void push(){
        top++;
        if(top>=(arsize-1)){
            System.out.println("Stack Overflow");
        }
        else{
            System.out.print("Enter element num to push: ");
            int num = sc.nextInt();
            
            stack[top] = num;
            System.out.println("Your number pushed. ");
        }
    } 
    void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            top--;
        }
    }
    void peep(){
        System.out.println("Enter index of num which see you");
        int i = sc.nextInt();
        if(stack[top-i+1]<=0){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println(stack[top-i+1]);
        }
    }
    void change(){
        System.out.println("Enter index of num which want to change: ");
        int i = sc.nextInt();
        System.out.println("Enter num which you want to change");
        int chnum = sc.nextInt();
        if(stack[top-i+1]<=0){
            System.out.println("Stack Underflow");
        }
        else{
            stack[top-i+1]=chnum;
        }
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}

class StackArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack sta = new Stack();
        boolean flag = true;
        

        while(flag){
            System.out.println("Enter 1-->push//2-->pop//3-->peep//4-->change//5-->display//6-->escape.");
            int condi = sc.nextInt();
            switch(condi){
                case 1:
                    sta.push();
                    break;
                case 2:
                    sta.pop();
                    break;
                case 3:
                    sta.peep();
                    break;
                case 4:
                    sta.change();
                    break;
                case 5:
                    sta.display();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
    }
}
