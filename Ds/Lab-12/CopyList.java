// 63. Write a program to copy a linked list.

import java.util.*;
class CopyList{

    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    Node newNode;
    Node first = null;
    Node cfirst = null;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CopyList list = new CopyList();
        boolean condi = true;
        while(condi){
            System.out.println("Enter 1.insert element//2.exit");
            int n = sc.nextInt();
            if(n==1){
                System.out.println("Enter element:");
                int num = sc.nextInt();
                list.insertNode(num);
            }
            else if(n==2){
                list.copyList();
                list.printAll();
                condi = false;
            }
            else{
                System.out.println("Invalid Input");
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

    public void copyList(){
        if(first == null){
            return;
        }

        Node current = first;
        Node copyelement = null;

        while (current != null) {
            Node newNode = new Node(current.info);
            if (cfirst == null) {
                cfirst = newNode;
            } else {
                copyelement.link = newNode;
            }
            copyelement = newNode;
            current = current.link;
        }
        
    }

    public void printAll(){
        if(first == null){
            System.out.println("Linked List is Null!");
            return;
        }

        Node current = first;
        Node copycurrent = cfirst;

        System.out.println("Original Linked List is: ");
        while(current != null){
            System.out.print(current.info+"-->");
            current = current.link;
        }
        System.out.println("null");

        System.out.println("Copy Linked List is: ");
        while(copycurrent != null){
            System.out.print(copycurrent.info+"-->");
            copycurrent = copycurrent.link;
        }
        System.out.print("null");
    }
}