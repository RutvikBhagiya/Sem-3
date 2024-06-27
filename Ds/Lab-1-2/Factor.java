//Write a program to find factors of a given number.

import java.util.*;

class Factor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factor.");
        int num = sc.nextInt();
        int i=1;

        System.out.println("Factor of "+num+" is");
        while (i<=num){
            if(num%i==0){
                System.out.println(i);
                i++;
            }
            else{
                i++;
            }
        }
    }
}