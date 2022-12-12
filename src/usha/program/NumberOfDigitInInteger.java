package usha.program;
//Write a program to find Number of digits in an integer
public class NumberOfDigitInInteger {
    public static void main(String[] args) {
        int count = 0;
        int number = 6778787;
        while (number!=0){
            number = number/10;
            count++;
        }
        System.out.println("Number of digit :"+count);

    }
}
