// 60. Write a program to implement stack using singly linked list.

import java.util.*;

class StackLinklist{
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }

    Node top = null;

    public static void main(String[] args){
        StackLinklist stack = new StackLinklist();
        Scanner sc = new Scanner(System.in);
        boolean condi = true;

        while(condi){
            System.out.println("Enter 1.Push//2.Pop//3.Peep//4.Display//5.Stop");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter num to push: ");
                    int num = sc.nextInt();
                    stack.push(num);
                    break;
                
                case 2: 
                    System.out.println("Num : "+stack.pop()+" Popped");
                    break;

                case 3:
                    System.out.println(stack.peep()+" on the top"); 
                    break;

                case 4:
                    stack.display();
                    break;
                
                case 5:
                    condi = false;
                    stack.display();
                    break;
            }
        }
    } 

    public void push(int data){
        Node newNode = new Node(data);

        if(top != null){
            newNode.link = top;
        }
        top = newNode;
        System.out.println("Pushed");
        
    }
    public int pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.info;
        top = top.link;
        return popped;
    }
    public int peep(){
        if(top == null){
            System.out.println("Stack is Empty");
            return -1;
        }
        int peeped = top.info;
        return peeped;
    }
    public void display(){
        if(top == null){
            System.out.print("Stack is Empty");
        }
        Node current = top;

        while(current != null){
            System.out.print(current.info+"-->");
            current = current.link;
        }
        System.out.println("null");
    }
}