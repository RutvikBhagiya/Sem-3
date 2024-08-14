// 51. Write a menu driven program to implement following operations on a circular queue using an Array
//  Insert
//  Delete
//  Display all elements of the queue

import java.util.*;

class CircularQueue{
    int length;
    int Q[];
    int F;
    int R;

    public CircularQueue(int length){
        this.length = length;
        this.Q = new int[length];
        this.F = -1;
        this.R = -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array:");
        int len = sc.nextInt();
        CircularQueue q = new CircularQueue(len); 
        boolean condi = true;

        while(condi){
            System.out.println("Enter 1.Enter Element//2.Delete Element//3.Display//4.Exit");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter num to insert:");
                    int num = sc.nextInt();
                    q.Enqueue(num);
                    break;

                case 2:
                    System.out.println("\'"+q.Dequeue()+"\'");
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    q.display();
                    condi = false;
                    break;
            }
        }
    }

    public void Enqueue(int data){
        if((R+1)%length == F){
            System.out.println("Overflow");
            return;
        }

        if(F == -1){
            F++;
        }
        
        R = (R+1)%length;
        Q[R] = data;
        System.out.println("Inserted");

        
    }

    public int Dequeue(){
        if(F == -1){
            System.out.println("Underflow");
            return -1;
        }
        int denum = Q[F];

        if(F == R){
            F = -1;
            R = -1;
            return denum;
        }

        F = (F+1)%length;
        return denum;
    }

    public void display(){
        if(F==-1){
            System.out.println("Empty");
            return;
        }
        int i = F;
        while(true){
            System.out.print(Q[i]+" ");
            if(i == R){
                break;
            }
            i = (i+1)%length;
        }
        System.out.println("  ");
    }
}