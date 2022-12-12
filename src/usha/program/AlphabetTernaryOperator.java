package usha.program;

public class AlphabetTernaryOperator {
    public static void checkAlphabet(char c){
        String output = (c<='a' && c>='z') || (c<='A' && c>='Z')
                ? c + "=Is alphabet "
                : c + "=Not alphabet ";
        System.out.println(output);
    }
    public static void main(String[] args) {
        checkAlphabet('2');

    }
}
