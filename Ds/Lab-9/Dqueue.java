// 52. Write a menu driven program to implement following operations on the Doubled Ended Queue- 
// -using an Array
//  Insert at front end, Insert at rear end
//  Delete from front end, Delete from rear end
//  Display all elements of the queue

import java.util.*;

class Dqueue{
    int length;
    int Q[];
    int F;
    int R;

    public Dqueue(int length){
        this.length = length;
        this.Q = new int[length];
        this.F = -1;
        this.R = -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an arry:");
        int len = sc.nextInt();
        Dqueue q = new Dqueue(len);

        boolean condi = true;

        while(condi){
            System.out.println("Enter 1.Insert at front//2.Insert at rear//3.Delete from front//4.Delete from rear//5.Display//6.Exit");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter num to insert at front: ");
                    int num = sc.nextInt();
                    q.DQInsert_Front(num);
                    break;

                case 2:
                    System.out.println("Enter num to insert at rear: ");
                    num = sc.nextInt();
                    q.DQInsert_Rear(num);
                    break;

                case 3:
                    System.out.println("'"+q.DQDelete_Front()+"' deleted");
                    break;

                case 4:
                    System.out.println("'"+q.DQDelete_Rear()+"' deleted");
                    break;

                case 5:
                    q.display();
                    break;

                case 6:
                    q.display();
                    condi = false;
                    break;
            }
        }
    }

    public void DQInsert_Front(int data){
        if(F == 0){
            System.out.println("Overflow");
            return;
        }

        if(F == -1){
            F++;
            R++;
        }
        else{
            F--;
        }
        Q[F] = data;
        System.out.println("Inserted");
    }

    public void DQInsert_Rear(int data){
        if(R >= (length-1)){
            System.out.println("Overflow");
            return;
        }

        if(F == -1){
            F++;
        }
        R++;
        Q[R] = data;
        System.out.println("Inserted");
    }

    public int DQDelete_Front(){
        if(F == -1){
            System.out.println("Underflow");
            return -1;
        }
        int dnum = Q[F];
        
        if(F == R){
            F = -1;
            R = -1;
        }
        else{
            F++;
        }
        return dnum;
    }

    public int DQDelete_Rear(){
        if(R == -1){
            System.out.println("Underflow");
            return -1;
        }

        int dnum = Q[R];

        if(F == R){
            F = -1;
            R = -1;
        }
        else{
            R--;
        }
        return dnum;
    }

    public void display(){
        if(F == -1){
            System.out.println("Empty");
            return;
        }
        for(int i=F;i<=R;i++){
            System.out.print(Q[i]+" ");
        }
        System.out.println(" ");
    }
}