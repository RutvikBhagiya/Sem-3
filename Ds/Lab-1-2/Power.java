//Write a program to find power of a number using loop.

import java.util.*;

class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Enter a power of these number : ");
        int power = sc.nextInt();
        double ans = 1;

        for(int i=0;i<power;i++){
            ans = ans*num;
        }

        System.out.println("Power of number "+num+" is "+ans);
    }
}