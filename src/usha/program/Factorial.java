package usha.program;
//5! = 5*4*3*2*1 = 120
//Write a program to find Factorial of a number
public class Factorial {
    public static void calculateFactorial(int number){
        int fact = 1;
        for (int i= 1;i<=number;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of " + number + " is =" + fact);


    }
    public static void main(String[] args) {
        calculateFactorial(5);

    }
}
