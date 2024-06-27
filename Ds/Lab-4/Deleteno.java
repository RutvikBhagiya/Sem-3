// Write a program to delete a number from a given location in an array.

import java.util.*;
class Deleteno{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter array num of index:"+i+" ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Now enter a index which delete that's element:");
        int loc = sc.nextInt();
        int num2 = n-1;
        int arr2[] = new int[num2];

        if (loc < 0 || loc > n) {
            System.out.println("Invalid index.");
        }

        for(int i=0;i<loc;i++){
            arr2[i] = arr[i];
        }
        for(int i=loc;i<num2;i++){
            arr2[i] = arr[i+1];
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