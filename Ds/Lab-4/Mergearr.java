//Write a program to merge two unsorted arrays.

import java.util.*;
class Mergearr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an 1st array:");
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for(int i=0;i<n1;i++){
            System.out.println("Enter array no of index:"+i);
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter length of an 2nd array:");
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for(int i=0;i<n2;i++){
            System.out.println("Enter array no of index:"+i);
            a2[i] = sc.nextInt();
        }

        int n = n1+n2;
        int atotal[] = new int[n];

        for(int i=0;i<n1;i++){
            atotal[i] = a1[i];
        }

        for(int i=0;i<n2;i++){
            atotal[n1+i] = a2[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(atotal[i]+" ");
        }
    }
}