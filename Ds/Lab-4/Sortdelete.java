// Write a program to delete a number from an array that is already sorted in an ascending order

import java.util.*;
class Sortdelete{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter arr no of index:"+i);
            arr[i] = sc.nextInt();
        }

        int num2 = n-1;
        int arr2[] = new int[num2];
        System.out.println("Which num you want to delete:");
        int delnum = sc.nextInt();
        int in = 0;

        for(int i=0;i<n;i++){
           
            if(delnum == arr[i]){
                 in = i;
                break;
            }
            else{
                arr2[i] = arr[i];
            }
        }

        for(int i=in;i<num2;i++){
            arr2[i] = arr[i+1];
        }
        for(int i=0;i<num2;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}