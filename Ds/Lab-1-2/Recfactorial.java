//Write a program to find factorial of a number. (Using Recursion)

import java.util.*;

public class Recfactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number which num's find you factorial.");
        int num = sc.nextInt();
        
        int factorial = Factorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
    
    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
}