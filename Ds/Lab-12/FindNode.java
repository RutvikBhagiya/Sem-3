// 66. WAP to swap Kth node from beginning with Kth node from end in a singly linked list.

import java.util.*;
class FindNode{
    class Node{
        int info;
        Node link;
        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    int count = 1;
    Node first = null;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        FindNode list = new FindNode();
        boolean condi = true;

        while(condi){
            System.out.println("Enter 1.insert element//2.display//3.to swap//4.exit");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter num to insert element: ");
                    int num = sc.nextInt();
                    list.insertNode(num);
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    list.swapKthNode();
                    break;

                case 4:
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

    public void swapKthNode(){
        Scanner sc = new Scanner(System.in);
        Node current = first;
        Node finode = null;
        Node linode = null;

        System.out.println("Enter index from first");
        int findex = sc.nextInt();
        System.out.println("Enter index from last");
        int lindex = sc.nextInt();

        while(current != null){
            if(count == findex){
                finode = current;
            }
            if(count == lindex){
                linode = current;
            }
            current = current.link;
            count++;
        }
        if(findex == 0 || lindex == 0){
            System.out.println("Not Swapable!");
            return;
        }
        Node temp = finode;
        finode = linode;
        linode = temp;
    }

    public void display(){
        if(first == null){
            System.out.println("Empty");
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