package usha.program;

public class EvenOdd {
    public static void checkEvenOdd(int number){
        if (number%2==0){
            System.out.println("Number is Even :"+number);
        }else {
            System.out.println("Number is Odd :"+number);
        }

    }
    public static void main(String[] args) {
        checkEvenOdd(9);

    }
}
