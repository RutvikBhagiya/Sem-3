//62. WAP to remove duplicate elements from a singly linked list.

import java.util.*;

class Duplicatedelete{
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

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Duplicatedelete list = new Duplicatedelete();
        boolean condi = true;

        while(condi){
            System.out.println("Enter 1.Insert Element//2.Exit");
            int n = sc.nextInt();
            if(n == 1){
                System.out.println("Enter num to insert: ");
                int num = sc.nextInt();
                list.insertNode(num);
            }
            else if(n == 2){
                condi = false;
                list.removeDuplicate();
                list.display();
            }
            else{
                System.out.println("Invalid num");
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

    public void removeDuplicate(){
        Node current = first;
        while(current != null){
            Node runner = current;
            while(runner.link != null){
                if(runner.link.info == current.info){
                    runner.link = runner.link.link;
                }
                else{
                    runner = runner.link;
                }
            }
            current = current.link;
        }
    }

    public void display(){
        Node save = first;
        while(save!=null){
            System.out.print(save.info+"-->");
            save = save.link;
        }
        System.out.println("null");
    }
}