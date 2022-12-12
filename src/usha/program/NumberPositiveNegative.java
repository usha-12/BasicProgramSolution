package usha.program;
//Write a program to identify of the number is positive or negative
public class NumberPositiveNegative {
    public static void checkPositiveNegative(int number){
      if (number>0)
          System.out.println("Number is Positive :"+number);
      else if (number<0) {
          System.out.println("Number is Negative :"+number);

      }
    }
    public static void main(String[] args) {
        checkPositiveNegative(10);

    }
}
