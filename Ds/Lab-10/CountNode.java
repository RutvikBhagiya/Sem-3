// Write a program to count the number of nodes in a singly circularly linked list.
import java.util.*;
class CountNode{
    static int size = 0;
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
        CountNode list = new CountNode();
        boolean condi = true;

        while(condi){
            System.out.println("1-->toInsert//2-->Escape");
            int num = sc.nextInt();
            if(num==1){
                list.insertNum();
            }
            else if(num==2){
                condi = false;
            }
            else{
                System.out.println("Invalid Input!");
            }
        }
        System.out.println("Size : "+size);
    }

    public void insertNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to add : ");
        int number = sc.nextInt();
        Node newNum = new Node(number);

        if(first != null){
            newNum.link = first;
        }
        first = newNum;
        System.out.println("Inserted");
        size++;
    }
}