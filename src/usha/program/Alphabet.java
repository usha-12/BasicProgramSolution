package usha.program;
//Write a program to identify if the character is an alphabet or not
public class Alphabet {
    public static void  checkAlphabet(char c ){
        if ((c<='a' && c >='z') || (c<='A' && c>='Z'))
            System.out.println("Is Alphabet :"+c);
        else
            System.out.println("Is Not Alphabet :"+c);

    }
    public static void main(String[] args) {
        System.out.println("--------Welcome to check alphabet program---------");
        checkAlphabet('8');

    }
}
