//Write a program to find factorial of a number. (Using Loop)

import java.util.*;

class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number which num's find you factorial.");
        int num = sc.nextInt();
        int nnum = num;
        int ans = 1;
        while(num!=0){
            ans = ans*num;
            num--;
        }
        System.out.println("The factorial of "+nnum+" is "+ans);
    }
}