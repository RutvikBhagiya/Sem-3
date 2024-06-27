// Write a program to insert a number at a given location in an array

import java.util.*;
class Insertno{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter array num of index:"+i+" ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a num you wnat to add");
        int number = sc.nextInt();
        System.out.println("At which index you want to add these element,");
        int loc = sc.nextInt();
        int num2 = n+1;
        int arr2[] = new int[num2];

        if (loc < 0 || loc > n) {
            System.out.println("Invalid index.");
        }

        for(int i=0;i<loc;i++){
                arr2[i] = arr[i];
        }

        arr[loc] = number;

         for (int i = loc; i < n; i++) {
            arr2[i + 1] = arr[i];
        }
        System.out.println("Your old array is,");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
         System.out.println("Your new array is,");
        for(int i=0;i<num2;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}