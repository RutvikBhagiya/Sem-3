// 74. WAP to split a circular linked list into two halves.

import java.util.*;

class CircularSplit{
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }

    Node first = null;
    Node last = null;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CircularSplit list = new CircularSplit();
        boolean condi = true;

        while(condi){
            System.out.println("Enter 1.Insert element//2.Display//3.Split//4.Exit");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter element to insert: ");
                    int num = sc.nextInt();
                    list.CirInsert(num);
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    list.CirSplit();
                    break;

                case 4:
                    list.display();
                    condi = false;
                    break;
            }
        }
    }

    public void CirInsert(int data){
        Node newNode = new Node(data);
        if(first == null){
            newNode.link = newNode;
            last = newNode;
            first = last;
        }
        else{
            newNode.link = first;
            last.link = newNode;
            last = newNode;
        }
        System.out.println("Inserted");

    }

    public void CirSplit(){
        if(first == null || first.link == first){
            System.out.println("Not Splitable");
            return;
        }
        
        Node slow = first;
        Node fast = first;

        while(fast.link != first && fast.link.link != first){
            slow = slow.link;
            fast = fast.link.link;
        }

        //for even num to adjust fast <---
        if(fast.link.link == first){
            fast = fast.link;
        }

        //make first part list and second part
        Node firstPart = first;
        Node secondPart = slow.link;

        //to make circular splited list
        slow.link = firstPart;
        fast.link = secondPart;

        System.out.println("Splited");

        System.out.println("First Part");
        display(firstPart);

        System.out.println("Second Part");
        display(secondPart);
        
    }

    public void display(){
        if(first == null){
            System.out.println("Empty");
            return;
        }
        Node current = first;

        while(current.link != first){
            System.out.print(current.info+"-->");
            current = current.link;
        }
        System.out.println(current.info+"-->(Back To First Node is: "+first.info+")");
    }

    public void display(Node start){
        if(start == null){
            System.out.println("Empty");
            return;
        }
        Node current = start;

        while(current.link != start){
            System.out.print(current.info+"-->");
            current = current.link;
        }
        System.out.println(current.info+"-->(Back To First Node is: "+start.info+")");
    }
}