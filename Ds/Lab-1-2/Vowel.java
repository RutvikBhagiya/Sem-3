//Write a program to determine whether the entered character is vowel or not

import java.util.*;

class Vowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to find its vowel or consonant");
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Your entered character "+ch+" is vowel");
        }
        else{
            System.out.println("Your entered character "+ch+" is consonant");
        }
    }
}