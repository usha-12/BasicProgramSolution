package usha.program;

public class AlphabetUsingMethod {
    public static void checkAlphabet(char c){
        if (Character.isAlphabetic(c)){
            System.out.println("Is Alphabet:"+c);
        }else
            System.out.println("Not Alphabet:"+c);

    }
    public static void main(String[] args) {
        checkAlphabet('1');

    }
}
