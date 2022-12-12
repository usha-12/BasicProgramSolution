package usha.program;

import java.util.Scanner;

//Write a program to identify if the character is a vowel or consonant
public class Vowel {
    public static void checkVowelOrConsonant(char ch ){
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' && ch=='A' || ch == 'E' || ch== 'I' || ch=='O' || ch=='U'){
            System.out.println("Character is Vowel : "+ch);
        }else
            System.out.println("Character is consonant : "+ch);

    }
    public static void main(String[] args) {
        System.out.println("-----------Welcome to the program check character is a vowel or consonant-------------");
        checkVowelOrConsonant('A');

    }
}
