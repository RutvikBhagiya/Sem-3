// WAP to check whether 2 singly linked lists are same or not
import java.util.*;
class ListSame{

    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    Node first1 = null;
    Node first2 = null;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ListSame list = new ListSame();
        boolean condi = true;
        int n;

        System.out.println("For First Node");
            
        while(condi){
            System.out.println("Enter 1 to insert num and any num to break");
            n = sc.nextInt();
            if(n==1){
                System.out.println("Enter num to insert");
                int insernum = sc.nextInt();
                list.insertNum1(insernum);
            }
            else{
                System.out.println("For Second Node");
                while(condi){
                    
                    System.out.println("Enter 1 to insert num and any num to break");
                    n = sc.nextInt();
                    if(n==1){
                        System.out.println("Enter num to insert");
                        int insernum = sc.nextInt();
                        list.insertNum2(insernum);
                    }
                    else{
                        condi = false;
                    }
                }
            }
        }
        System.out.println("Your Two Nodes Are : "+list.toCheckSame());
    }


    public void insertNum1(int data){
        Node newNode = new Node(data);
        if(first1 != null){
            newNode.link = first1;
        }
        first1 = newNode;
    }

    public void insertNum2(int data){
        Node newNode = new Node(data);
        if(first2 != null){
            newNode.link = first2;
        }
        first2 = newNode;
    }

    public String toCheckSame(){
        Node save1 = first1;
        Node save2 = first2;

        while(save1 != null && save2 != null){
            if(save1.info != save2.info){
                return "Not Same";
            }
            save1 = save1.link;
            save2 = save2.link;
        }
        if(save1 == null && save2 == null){
            return "Same";
        }
        else{
            return "Not Same";
        }
    }
   
}