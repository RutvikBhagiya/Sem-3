// 71. Write a menu driven program to implement following operations on the 
// circular linked list.
//  Insert a node at the front of the linked list.
//  Delete a node from specified position.
//  Insert a node at the end of the linked list.
//  Display all nodes.


import java.util.*;

class Circularlist{
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
    Node last = null;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circularlist list = new Circularlist();
        boolean condi = true;
        int num = 0;
        int n;

        while(condi){
            System.out.println("Enter 1-->insert at First//2-->insert at End//3-->Delete at position//4-->Display LinkedList//5-->Stop");
            n = sc.nextInt();
           switch(n){
            case 1:
                System.out.println("Enter num to insert at first:");
                num = sc.nextInt();
                list.insertFirst(num);
                break;
            case 2:
                System.out.println("Enter num to insert at last:");
                num = sc.nextInt();
                list.insertLast(num);
                break;
            case 3:
                System.out.println("Enter num position to delete:");
                num = sc.nextInt();
                list.deletePosi(num);
                break;
            case 4:
                list.displayList();
                break;
            case 5:
                condi = false;
                list.displayList();
           } 
        }
    }

    public void insertFirst(int data){
        newNode = new Node(data);
        if(first==null){
            newNode.link = newNode;
            last = newNode;
            first = last;
        }
        else{
            newNode.link = first;
            last.link = newNode;
            first = newNode;
        }
        System.out.println("Inserted First!");
        
    }

    public void insertLast(int data){
        newNode = new Node(data);
        if(first==null){
            newNode.link = newNode;
            last = newNode;
            first = last;
        }
        else{
            newNode.link = first;
            last.link = newNode;
            last = newNode;
        }
        System.out.println("Inserted Last!");
    }

    public void deletePosi(int position){
        if (first == null){
            System.out.println("Underflow");
        }

        if(position == 1){
            if(first == last){
                first = null;
                last = null;
            }
            else{
                first = first.link;
                last.link = first;
            }
            System.out.println("Dleted At Position!");
            return;
        }

        Node current = first;
        Node previous = null;
        int count = 1;

        while(count < position && current.link != null){
            previous = current;
            current = current.link;
            count++;
        }

        if(count == position){
            if(current == last){
                last = previous;
            }
            previous.link = current.link;
            System.out.println("Dleted At Position!");
        }
        else{
            System.out.println("Position not founded");
        }
    }    

    public void displayList(){
        Node current = first;
        if(first == null){
            System.out.println("List is Empty");
            return;
        }
        while(current.link != first){
            System.out.print(current.info+"-->");
            current = current.link;
        }
        System.out.println(current.info+"-->(Back To First Node is: "+first.info+")");
    }
}