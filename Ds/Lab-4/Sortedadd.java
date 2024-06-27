// Write a program to insert a number in an array that is already sorted in an ascending order.

import java.util.*;

class Sortedadd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter a num at index of:"+i+" ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a number you want to add these array:");
        int number = sc.nextInt();
        int num2 = n+1;
        int arr2[] = new int[num2];
        int loc = 0;
       
        for(int i=0;i<n;i++){
            if(number<arr[i]){
                loc = i;
                break;
                }
                arr2[i] = arr[i];
            }

        arr2[loc] = number;

         for (int i = loc; i < n; i++) {
            arr2[i+1] = arr[i];
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