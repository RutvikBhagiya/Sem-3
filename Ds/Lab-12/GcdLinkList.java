// 67. WAP to perform given operation in the linked list. There exist a Linked List. Add a node 
//that contains the GCD of that two nodes between every pair adjacent node of Linked List.

import java.util.*;
class GcdLinkList{
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
        GcdLinkList list = new GcdLinkList();
        boolean condi = true;

        while(condi){
            System.out.println("Enter 1.Insert element//2.Display//3.To Find Gcd//4.exit");
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
                    list.gcdList();
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
    public void display(){
        Node current = first;
        while(current != null){
            System.out.print(current.info+"-->");
            current = current.link;
        }
        System.out.println("null");
    }
    public void gcdList(){
        Node current = first;
        while(current.link != null){
            int gcdValue = gcd(current.info,current.link.info);
            Node gcdNode = new Node(gcdValue);

            gcdNode.link = current.link;
            current.link = gcdNode;
            current = gcdNode.link;
        }
        System.out.println("Completed");
    }

    public int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}