//. Write a program to find position of the smallest number & the largest number from given n numbers.

import java.util.*;

class Findls{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of an array:");
    int n = sc.nextInt();
    int arr[] = new int[n];

    for(int i=0;i<n;i++){
            System.out.println("Enter array num of index:"+i);
            arr[i] = sc.nextInt();
        }

    int largenum = arr[0];
    int smallnum = arr[0];
    int largeindex = 0;
    int smallindex = 0;

        for(int j=1;j<n;j++){
            if(arr[j]>largenum){
                largenum = arr[j];
                largeindex = j;
            }
            if(arr[j]<smallnum){
                smallnum = arr[j];
                smallindex = j;
            }
        }
        System.out.println("Your largest num is: "+largenum+" & its index is: "+largeindex);
        System.out.println("Your smallest num is: "+smallnum+" & its index is: "+smallindex);
    }
}