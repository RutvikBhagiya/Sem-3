//Write a program to read and display n numbers using an array.

import java.util.*;

class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter array of index:"+i);
            arr[i] = sc.nextInt();
        }


        System.out.println("Your array is likes below");
        for(int i=0;i<n;i++){
            System.out.println("Array index of :"+i+" is "+arr[i]);
        }
    }
}