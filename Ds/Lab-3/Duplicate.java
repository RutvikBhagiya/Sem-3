//Write a program to find whether the array contains a duplicate number or not.
import java.util.*;

class Duplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        int count=0;

        for(int i=0;i<n;i++){
            System.out.println("Enter array of index:"+i);
            arr[i] = sc.nextInt();
        }

        System.out.println("All duplicates are here,");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                   arr2[count] = arr[i];
                   count++;
                }
            }
        }
       if(count == 0){
        System.out.println("No Duplicates in array");
       }
       else{
        for(int i=0;i<count;i++){
            if((arr2[i])&&(arr2[(i)+1])){
            }
            else{
                System.out.println(arr2[i]);
            }
        }
    }
}
}