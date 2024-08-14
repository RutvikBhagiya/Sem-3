// 65. Write a program to sort elements of a linked list.

import java.util.*;
class SortList{
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    Node first = null;

    public static void main(String[] args){
        SortList list = new SortList();
        Scanner sc = new Scanner(System.in);
        boolean condi = true;

        while(condi){
            System.out.println("Enter 1.insert element//2.exit");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter element:");
                    int num = sc.nextInt();
                    list.insertNode(num);
                    break;

                case 2:
                    System.out.println("Original List");
                    list.display();
                    System.out.println("Sorted List");
                    list.sortLinkList();
                    list.display();
                    condi = false;
                    break;
            }
        }
    }

    public void insertNode(int data){
        Node newNode = new Node(data);
        if(first != null){
            newNode.link = first;
        }
        first = newNode;
        System.out.println("Inserted");
    }

    public void sortLinkList(){
        if(first == null || first.link == null){
            return;
        }
       
        Node current = first;

        while(current != null){
            Node min = current;
            Node index = current.link;

            while(index != null){
                if(index.info < min.info){
                    min = index;
                }
                //move to next index to find min
                index = index.link;
            }
            //min number find then swap these other wise----> current swap to it self<---
            int temp = current.info;
            current.info = min.info;
            min.info = temp;

            //move to next current 
            current = current.link;
        }
    }

    public void display(){
        if(first == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node current = first;
        while(current != null){
            System.out.print(current.info+"-->");
            current = current.link;
        }
        System.out.println("null");
    }
}