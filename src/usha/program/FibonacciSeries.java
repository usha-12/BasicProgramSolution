package usha.program;
// Write a program to find Fibonacci series up to n
public class FibonacciSeries {
    public static void printFibonacci(int number){
        int firstTerm=0,secondTerm=1;
        System.out.println("____Fibonacci Series___");
        for (int i =1; i<=number;i++){
            System.out.print(firstTerm+",");
            int nextTerm = firstTerm+secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
    public static void main(String[] args) {
        printFibonacci(20);

    }

}
