// Write a menu driven program to implement following operations on the singly 
// linked list. 
//  Insert a node at the front of the linked list.
//  Display all nodes.
//  Delete a first node of the linked list.
//  Insert a node at the end of the linked list.
//  Delete a last node of the linked list.
//  Delete a node from specified position.
import java.util.*;

class AllLinkedList{
    int size = 0;
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
    public void insertAtFirst(int data){
        newNode = new Node(data);

        if(first!=null){
            newNode.link = first;
        }
        first = newNode;
        size++;
        System.out.println("Inserted At First");
    }
    
    public void insertAtLast(int data){
        newNode = new Node(data);
        
        if(first==null){
            first = newNode;
            size++;
            return;
        }

        Node current = first;

        while(current.link!=null){
           current = current.link;
        }
        current.link = newNode;
        size++;
        System.out.println("Inserted At Last");
    }
    
    public void deleteAtFirst(){
        if(first==null){
            System.out.println("UnderFlow");
            return;
        }
        Node second = first.link;

        if(second!=null){
            first.link = second.link;
            first = second;
            size--;
            System.out.println("Deleted at first");
        }
        else{
            size--;
            first = null;
            System.out.println("Deleted at first");
        }
        
        
    }
    
    public void deleteAtLast(){
        if(first==null){
            System.out.println("Underflow");
            return;
        }
        if(first.link==null){
            first = null;
            size--;
            System.out.println("Deleted at last");
            return;
        }
        Node prec = null;
        Node last = first;
        while(last.link != null){
            prec = last;
            last = last.link;
        }
        size--;
        System.out.println("Deleted at last");
        prec.link = null;
    }
    
    public void deleteByNumber(int numdel){
        int number = numdel;
       
        if(first==null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node pred = null;
        Node save = first;
        if(save.info==number){
            first = save.link;
            return;
        }

        while(save.link!=null && save.info!=number){
            pred = save;
            save = save.link;
        }

        if(save==null){
            System.out.println("Number is not found");
            return;
        }
        pred.link = save.link;
        System.out.println("Deleted!");
    }
    
    public void displayNode(){
        Node save = first;
        while(save!=null){
            System.out.print(save.info+"-->");
            save = save.link;
        }
        System.out.println("null");
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AllLinkedList list = new AllLinkedList();
        int num;

        boolean condi = true;
        while(condi){
             System.out.println("Enter 1-->Insert At First//2-->Insert At Last//3-->Delete At First//4-->Delete At Last//5-->Delete By Number//6-->Display//7-->Stop");
             int casenum = sc.nextInt();
            switch(casenum){
                case 1 :
                    System.out.println("Enter a num you want to add at first: ");
                    num = sc.nextInt();
                    list.insertAtFirst(num);
                    break;
                case 2 :
                    System.out.println("Enter a num you want to add at last: ");
                    num = sc.nextInt();
                    list.insertAtLast(num);
                    break;
                case 3 :
                    list.deleteAtFirst();
                    break;
                case 4 :
                    list.deleteAtLast();
                    break;
                case 5 :
                    System.out.println("Enter num you want to delete: ");
                    int numdel = sc.nextInt();
                    list.deleteByNumber(numdel);
                    break;
                case 6 :
                    list.displayNode();
                    break;
                case 7 :
                    condi = false;
                    break;
            } 
        }
    }
}