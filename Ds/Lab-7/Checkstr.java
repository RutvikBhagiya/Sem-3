// Write a program to determine if an input character string is of the form a^ib^i
// where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’.

import java.util.*;

public class Checkstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();

        int aCount = 0;
        int bCount = 0;
        boolean condi = true;

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            if(ch == 'a'){
                if (bCount > 0) {
                    condi = false;
                    break;
                }
                aCount++;
            } 
            else if(ch == 'b') {
                bCount++;
            } 
            else{
                condi = false;
                break;
            }
        }

        if(condi && aCount == bCount && aCount > 0) {
            System.out.println("Valid");
        } 
        else{
            System.out.println("Invalid");
        }
    }
}
