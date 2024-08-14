// 50. Write a menu driven program to implement following operations on the Queue using an Array
//  ENQUEUE
//  DEQUEUE
//  DISPLAY
import java.util.*;
class QueueArr{
    int F;
    int R;
    int length;
    int[] Q;

    public QueueArr(int x){
        this.length = x;
        this.Q = new int[x];
        this.F = -1;
        this.R = -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array:");
        int len = sc.nextInt();
        QueueArr q = new QueueArr(len); 
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
        if(R>=length-1){
            System.out.println("Overflow");
            return;
        }

        if(F==-1){
            F++;
        }
        R++;
        Q[R] = data;
        System.out.println("Inserted");
    }
    public int Dequeue(){
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
    public void display(){
        if(F==-1){
            System.out.println("Empty!");
            return;
        }

        for(int i=F;i<=R;i++){
            System.out.print(Q[i]+"  ");
        }
        System.out.println("");
    }
}