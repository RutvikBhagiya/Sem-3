// A-91. Write a program to implement a Binary Search using Array.

import java.util.*;
class BinarySearch{
    static int length;
    static int arr[];
    public BinarySearch(int length){
        this.length = length;
        this.arr = new int[length];
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array:");
        int len = sc.nextInt();
        BinarySearch binary = new BinarySearch(len);
        for(int i=0;i<len;i++){
            System.out.println("Enter num to add at array:");
            int num = sc.nextInt();
            arr[i] = num;
            System.out.println("Inserted");
        }
        boolean condi = true;
        while(condi){
            System.out.println("Enter 1.Search Element//2.Exit");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter num to search:");
                    int snum = sc.nextInt();
                    System.out.println(binary.searchBinary(snum) ? "Founded":"Not Founded");
                    break;

                case 2:
                    condi = false;
                    break;
            }
        }
    }

    public boolean searchBinary(int num){
        int left = 0;
        int right = length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == num){
                return true;
            }
            else if(arr[mid]>num){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return false;
    }
}