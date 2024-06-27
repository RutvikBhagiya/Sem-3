//Write a program to calculate sum of numbers from m to n.

import java.util.*;

class Sumofmn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first num:");
        int a = sc.nextInt();
        System.out.println("Enter a second num:");
        int b = sc.nextInt();
        int ans = 0;

        if(a>b){     
            for(int i=b;i<=a;i++){
                ans = ans+b;
                b++;
            }
        }
        else{
            for(int i=a;i<=b;i++){
                ans = ans+a;
                a++;
            }
        }
           System.out.println("Sum is: "+ans);
    }
}