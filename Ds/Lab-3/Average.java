//Write a program to calculate sum of numbers from m to n.

import java.util.*;

class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find average:");
        int num = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=num;i++){
            ans = ans+i;
        }
        double avg = ans/num;
        System.out.println("Average is: "+avg);
    }
}