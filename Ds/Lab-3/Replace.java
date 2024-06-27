//Read n numbers in an array then read two different numbers, replace 1st number with 
//2nd number in an array and print its index and final array.

import java.util.*;
class Replace{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean condi = true;

        for(int i=0;i<n;i++){
            System.out.println("Enter array no of index:"+i);
            arr[i] = sc.nextInt();
        }
        System.out.println("old array is,");
        for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
        }

        System.out.println("Enter a number which want to you replce:");
        int num1 = sc.nextInt();
        System.out.println("Enter a number which you want to replace with 1st num:");
        int num2 = sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==num1){
                arr[i] = num2;
                condi = false;
                break;
            }
        }
       
    
        if(condi){
            System.out.println("your entered num is not exist..");
        }
        else{
             System.out.println("New array is,");
              for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
              }
            System.out.println("your entered num:"+num1+" is replaced by:"+num2);
        }
    }
}