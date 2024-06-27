//Write a program to find whether a number is odd or even

import java.util.*;

class Odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find odd or even");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Number "+num+" is even");
        }
        else{
            {
            System.out.println("Number "+num+" is odd");
        }
        }
    }
}