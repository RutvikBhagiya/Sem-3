// Read two 2x2 matrices and perform addition of matrices into third matrix and print it
import java.util.*;
class Matrixadd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of arr1,");
        int a1[][] = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter num of arr["+i+"]["+j+"]:");
                a1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter details of arr2,");
        int a2[][] = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter num of arr["+i+"]["+j+"]:");
                a2[i][j] = sc.nextInt();
            }
        }

        int asum[][] = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                asum[i][j] = a1[i][j] + a2[i][j];
            }
        }

        System.out.println("Your Final Matrix Is,")
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(asum[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}