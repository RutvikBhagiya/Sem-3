// 61. Write a program to implement queue using singly linked list.

import java.util.*;
class QueueList{
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

    public void enQueue(int data){
        Node newNode = new Node(data);

        if(first == null && last == null){
            first = last = newNode;
        }
        else{
            last.link = newNode;
            last = newNode;
        }
        System.out.println("Inserted");
    }
    public int deQueue(){
        if(first == null){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int fnum = first.info;
        if(first == last){
            last = null;
            first = null;
            return fnum;
        }
        first = first.link;
        return fnum;
    }
    public void displayQueue(){
        if(first == null){
            System.out.println("Queue is Empty!");
            return;
        }

        Node current = first;
        while(current != null){
            System.out.print(current.info+"  ");
            current = current.link;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        QueueList queue = new QueueList();
        boolean condi = true;

        while(condi){
            System.out.println("Enter 1.Insert Element//2.Dlete Element//3.Escape");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter num to insert: ");
                    int num = sc.nextInt();
                    queue.enQueue(num);
                    break;

                case 2:
                    System.out.println(queue.deQueue()+" Deleted");
                    break;

                case 3:
                    queue.displayQueue();
                    condi = false;
                    break;
            }
        }
    }
}