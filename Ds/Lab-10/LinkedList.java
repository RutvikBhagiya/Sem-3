// Write a program to implement a node structure for singly linked list. Read the data in a 
//node, print the node.

import java.util.*;

class LinkedList{
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }

     Node first = null;

    public void insertFirst(int data){
        Node  newNode = new Node(data);

        if(first!=null){
             newNode.link = first;
        }
        first = newNode;
        System.out.println("Number Inserted");
    }

    public void printNode(){ 
        Node save = first;
        while(save!=null){
            System.out.print(save.info+"-->");
            save = save.link;
        }
        System.out.println("null");
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        boolean flag = true;
        while(flag){
            System.out.println("Enter 1-->insert//2-->print//3-->stop");
            int condi = sc.nextInt();
            switch(condi){
                case 1:
                    System.out.println("Enter a num to insert: ");
                    int num = sc.nextInt();
                    list.insertFirst(num);
                    break;
                case 2:
                    list.printNode();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.print("Invalid Input");
            }
        }
    }
}