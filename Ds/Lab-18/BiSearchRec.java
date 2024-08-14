// Extra binary search using recursion

import java.util.*;

class BiSearchRec{
    int length;
    int arr[];

    public BiSearchRec(int length){
        this.length = length;
        this.arr = new int[length];
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array:");
        int len = sc.nextInt();
        BiSearchRec binary = new BiSearchRec(len);
        for(int i=0;i<len;i++){
            System.out.println("Enter num to add at array:");
            int num = sc.nextInt();
            binary.arr[i] = num;
            System.out.println("Inserted");
        }
        boolean condi = true;
        while(condi){
            System.out.println("Enter 1.Search Element//2.Exit");
            int n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter num to search:");
                    int snum = sc.nextInt();
                    System.out.println(binary.searchBinary(0,len-1,snum) ? "Found" : "Not Founded");
                    break;

                case 2:
                    condi = false;
                    break;
            }
        }
    }

    public boolean searchBinary(int left,int right,int num){
            int mid = (left + right)/2;
            if(left<=right){
                if(arr[mid] == num){
                    return true;
                }
                else if(arr[mid]>num){
                    return searchBinary(left,mid-1,num);
                }
                else{
                    return searchBinary(mid+1,right,num);
                }
            }
        return false;
    }
}