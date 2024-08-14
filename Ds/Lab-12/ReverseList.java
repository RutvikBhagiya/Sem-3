//64. Write a program to reverse a linked list.

import java.util.*;

class ReverseList{
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }

    Node first = null;
    Node newNode;

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ReverseList list = new ReverseList();
        boolean condi = true;

        while(condi){
            System.out.println("Enter 1.Insert Element//2.Exit");
            int n = sc.nextInt();
        
            switch(n){
                case 1:
                    System.out.println("Enter Element To insert:");
                    int num = sc.nextInt();
                    list.insertNode(num);
                    break;


                case 2:
                    System.out.println("Original Liked list");
                    list.display();
                    System.out.println("Reversed Liked list");
                    list.reverseList();
                    list.display();
                    
                    condi = false;
                    break;
            }
        }
    }

    public void insertNode(int data){
        newNode = new Node(data);
        
        if(first != null){
            newNode.link = first;
        }
        first = newNode;
        System.out.println("Inserted");

    }

    public void reverseList() {
        Node pre = null;
        Node current = first;
        Node next = null;
        
        while (current != null) {
            next = current.link;
            current.link = pre;
            pre = current;
            current = next;
        }
        first = pre;
    }

    public void display(){
        Node current = first;
        if(first == null){
            System.out.println("Linked List Empty!!");
            return;
        }
        while(current != null){
            System.out.print(current.info+"-->");
            current = current.link;
        }
        System.out.println("null");
    }
    
}