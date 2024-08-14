// 73. WAP to delete alternate nodes of a doubly linked list.

import java.util.*;
class DelDouList{
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

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DelDouList list = new DelDouList();
        boolean condi = true; 

        while(condi){
            System.out.println("Enter 1.Insert Element//2.Disply//3.Delete Alternate node//4.Exit");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter num to insert: ");
                    int num = sc.nextInt();
                    list.insertNode(num);
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    list.deleteAlter();
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
        if(first == null){
            first = newNode;
            last = newNode;
        }
        else{
            last.rptr = newNode;
            newNode.lptr = last;
            last = newNode;
        }
        System.out.println("Inserted"); 
    }

    public void deleteAlter(){
        if(first == null){
            System.out.println("Empty");
            return;
        }
        Node current = first;
        
        while (current.rptr != null) {
            Node nextNode = current.rptr;
            current.rptr = nextNode.rptr;

            if(nextNode.rptr != null){
                nextNode.rptr.lptr = current;
            }
            else{
                return;
            }
            current = current.rptr;
        }
        System.out.println("Successfully deleted alternate nodes!");
    }

    public void display(){
        if(first == null){
            System.out.println("List is Empty");
            return;
        }
        Node current = first;
        System.out.print("null<-->");
        while(current != null){
            System.out.print(current.info+"<-->");
            current = current.rptr;
        }
        System.out.println("null");
    }
}