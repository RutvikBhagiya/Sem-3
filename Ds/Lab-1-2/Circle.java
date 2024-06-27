//Write a program to calculate area of a Circle (A = πr^2).

import java.lang.Math;
import java.util.*;

class Circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle.");
        int r = sc.nextInt();
        double area =Math.PI*r*r;
        System.out.println("Area of Radius "+r+" is"+area);
    }
}