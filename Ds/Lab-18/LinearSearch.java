//A-90. Write a program to implement a Linear Search using Array.

import java.util.*;
class LinearSearch{
    int length;
    static int arr[];

    public LinearSearch(int length){
        this.length = length;
        this.arr = new int[length];
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array:");
        int len = sc.nextInt();
        LinearSearch linear = new LinearSearch(len);
        for(int i=0;i<len;i++){
            System.out.println("Enter num to add at array:");
            int num = sc.nextInt();
            arr[i] = num;
            System.out.println("Inserted");
        }
        boolean condi = true;
        while(condi){
            System.out.println("Enter 1.Search num//2.Exit");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter num to search in array:");
                    int snum = sc.nextInt();
                    System.out.println(linear.searchElement(snum) ? "Founded":"Not Founded");
                    break;

                case 2:
                    condi = false;
                    break;
            }
        }
    }

    public boolean searchElement(int num){
        for(int i=0;i<length;i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}