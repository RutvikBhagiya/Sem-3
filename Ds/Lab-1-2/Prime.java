import java.util.*;

class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it's prime or not");
        int num = sc.nextInt();
        boolean condi = true;

        int i = 2;
        while(i<num/2){
            if(num%i==0){
                System.out.println("Your entered number "+num+" is not prime number");
                condi = false;
            }
                i++;
        }
        if(condi){
            System.out.println("Your entered number "+num+" is prime number");
        }
    }
}