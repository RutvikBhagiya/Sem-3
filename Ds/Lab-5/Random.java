//  Design anagram game using array. 
    //  Allow a user to enter N words and store it in an array. 
    //  Generate a random number between 0 to N-1. 
    //  Based on the random number generated display the word stored at that 
    // index of an array and allow user to enter its anagram. 
    //  Check whether the word entered by the user is an anagram of displayed 
    // number or not and display an appropriate message. 
    //  Given a word A and word B. B is said to be an anagram of A if and only if 
    // the characters present in B is same as characters present in A, 
    // irrespective of their sequence. For ex: “LISTEN” == “SILENT”

    import java.util.*;
    import java.lang.Math;
    class Random{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a length of words");
            int n = sc.nextInt();
            String[] words = new String[n];
            System.out.println("Enter word please:");
            for(int i=0;i<n;i++){
                words[i] = sc.next();
            }

            for(int i=0;i<n;i++){
                int b = parseInt(Math.random());
                System.out.print(words[b]);
            }
        }
    }