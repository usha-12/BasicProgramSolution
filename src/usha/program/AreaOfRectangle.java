package usha.program;

import java.util.Scanner;

public class AreaOfRectangle {
    //Write a program to find Area of a rectangle
    public static void areaOfRectangle(){
        int length, breadth, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        length = sc.nextInt();
        System.out.println("Enter the breadth");
        breadth = sc.nextInt();
        area = length*breadth;
        System.out.println("Area of a rectangle = "+area);

    }
    public static void main(String[] args) {
        areaOfRectangle();

    }
}
