// C-68. Write a program to swap two consecutive nodes in the linked list.
// Don’t change the values of nodes, implement by changing the link of the nodes.
//  Input: 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8
//  Output: 2 → 1 → 4 → 3 → 6 → 5 → 8 → 7

import java.util.*;
class SwapNode{
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
        Scanner sc = new Scanner(System.in);
        SwapNode list = new SwapNode();
        boolean condi = true;

        while(condi){
            System.out.println("Enter 1.Insert element//2.Display//3.swap two consecutive node//4.Exit");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter num to insert:");
                    int num = sc.nextInt();
                    list.insertNode(num);
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    list.swapNodes();
                    list.display();
                    break;

                case 4:
                    condi = false;
                    break;
            }
        }
    }

    public void insertNode(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
        }
        else{
            Node current = first;
            while(current.link != null){
                current = current.link;
            }
            current.link = newNode;
        }
        System.out.println("Inserted");
    }

    public void swapNodes(){
        if(first == null || first.link == null){
            System.out.println("Not swapable");
            return;
        }
        Node prev = null;
        Node current = first;
        first = current.link; // Change the first to the second node

        while(current != null && current.link != null) {
            Node next = current.link;
            current.link = next.link;
            next.link = current;

            if(prev != null) {
                prev.link = next;
            }

            prev = current;
            current = current.link;
            }
        }

    public void display(){
        if(first == null){
            System.out.println("List is Empty");
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