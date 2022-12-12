package usha.program;

import java.util.Scanner;

//Write a program to find Area of a Triangle
public class AreaOfTriangle {
    public static void main(String[] args) {
        double areaOfTriangle, b,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the b");
        b = sc.nextInt();
        System.out.println("Enter the h");
        h = sc.nextInt();
        areaOfTriangle = (b*h)/2;
        System.out.println("Area of a Triangle :"+areaOfTriangle);
    }
}
