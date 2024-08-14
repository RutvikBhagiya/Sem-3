// 72. Write a menu driven program to implement following operations on the doubly
// linked list.
//  Insert a node at the front of the linked list.
//  Delete a node from specified position.
//  Insert a node at the end of the linked list. (Home Work)
//  Display all nodes. (Home Work)

import java.util.*;
class Doublylist{

    class Node{
        int info;
        Node lptr;
        Node rptr;

        public Node(int data){
            this.info = data;
            this.lptr = null;
            this.rptr = null;
        }
    }
    Node first = null;
    Node last = null;
    Node newNode;


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Doublylist dlist = new Doublylist();
        boolean condi = true;
        while (condi) {
            System.out.println("Enter: 1.insertAtFirst//2.insertAtLast//3.DeletePosition//4.Display//5.Exit");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter num to add at first:");
                    int fnum = sc.nextInt();
                    dlist.insertAtFirst(fnum);
                    break;

                case 2:
                    System.out.println("Enter num to add at last:");
                    int lnum = sc.nextInt();
                    dlist.insertAtLast(lnum);
                    break;

                case 3:    
                    System.out.println("Enter position to delete:");
                    int posi = sc.nextInt();
                    dlist.deletePosi(posi);
                    break;

                case 4:
                    dlist.displayNode();
                    break;

                case 5:
                    dlist.displayNode();
                    condi = false;
                    break;
            }
        }
    }

    public void insertAtFirst(int data){
        newNode = new Node(data); 
        if(first == null){
            first = newNode;
            last = newNode;
        }
        else{
            newNode.rptr = first;
            first.lptr = newNode;
            first = newNode;
        }
        System.out.println("Inserted First");
    }

    public void insertAtLast(int data){
        newNode = new Node(data);
        if(last == null){
            first = newNode;
            last = newNode;
        }
        else{
            newNode.lptr = last;
            last.rptr = newNode;
            last = newNode;
        }
        System.out.println("Inserted Last");
    }

    public void deletePosi(int posi){

        if(first == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node current = first;
        int count = 1;
        if (posi == 1) {
            if (first == last) {
                first = null;
                last = null;
            } 
            else {
                first = first.rptr;
                first.lptr = null;
            }
        } 
        else {
            while (current != null && count < posi) {
                current = current.rptr;
                count++;
            }

            if (current == null) {
                System.out.println("Position not found.");
                return;
            }

            if (current == last) {
                last = last.lptr;
                last.rptr = null;
            } 
            else {
                current.lptr.rptr = current.rptr;
                current.rptr.lptr = current.lptr;
            }
        }
        System.out.println("Deleted at "+count);
    }

    public void displayNode(){
        if(first == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node current = first;
        System.out.print("null <--> ");

        while(current != null){
            System.out.print(current.info+" <--> ");
            current = current.rptr;
        }
        System.out.println("null");
    }
 }