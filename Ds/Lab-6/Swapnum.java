//Write a program to swap two numbers using user-defines method.

class Swapnum{
    public static void main(String[] args){
        int a = 5;
        int b = 4;
        
        swap(a,b);
    }
    public static void swap(int a1,int b1){
     System.out.println("Before swapping a = "+a1+" And b = "+b1);
    int temp = a1;
    a1 = b1;
    b1 = temp;
    System.out.println("After swapping a = "+a1+" And b = "+b1);
}
}
