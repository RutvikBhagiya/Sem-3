// C-69. Write a program to remove the duplicates nodes from given sorted Linked List.
//  Input: 1 → 1 → 6 → 13 → 13 → 13 → 27 → 27
//  Output: 1 → 6 → 13 → 27

import java.util.*;

class DuplicateSort{
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
        DuplicateSort list = new DuplicateSort();
        boolean condi = true;

        while(condi){
            System.out.println("Enter 1.Insert value//2.Delete Duplicates//3.Display//4.Exit");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter num to insert:");
                    int num = sc.nextInt();
                    list.insertNode(num);
                    break;

                case 2:
                    list.deleteSorted();
                    list.display();
                    break;

                case 3:
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
            return;
        }
        Node current = first;
        while(current.link != null){
            current = current.link;
        }
        current.link = newNode;
        System.out.println("Inserted");
    }

    public void deleteSorted(){
        if(first == null || first.link == null){
            System.out.println("Not deletable");
            return;
        }

        Node current = first;

        while(current.link != null){
            Node nextNode = current.link;
            while(current.info == nextNode.info && nextNode.link != null){
                current.link = nextNode.link;
                nextNode = nextNode.link;
            }
        if(nextNode.info==current.info && current.link.link==null){
            current.link = null;
            return;
        }
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