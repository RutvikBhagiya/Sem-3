// Write a program to find whether the array contains a duplicate number or not.

import java.util.*;
class Isduplicate{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean condi = true;

        for(int i=0;i<n;i++){
            System.out.println("Enter array of index:"+i);
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    condi = false;
                    System.out.println("Your array contained duplicate numbers"); 
                    break;
                }
            }
        }
        if(condi){
            System.out.println("Your array not contained duplicate numbers"); 
        }
        
    }
}