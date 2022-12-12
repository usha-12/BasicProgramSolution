package usha.program;

import java.util.Scanner;

public class AreaOfCircle {
    public static void calculateAreaOfCircle() {
        int r;
        double pi=3.14,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        r=sc.nextInt();
        area = pi*r*r;
        System.out.println("Area of circle is :"+area);

    }
    public static void main(String[] args) {
        calculateAreaOfCircle();

    }
}
