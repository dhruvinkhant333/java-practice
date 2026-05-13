/*
Write a Java program that prompts the user to enter a single letter
(character). Determine whether the entered character is a vowel (a, e,
i, o, u, case-insensitive) or a consonant, and display the result.
*/

import java.util.Scanner;

public class code_Practice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single letter (character) : ");
        char ch = scanner.next().charAt(0);

        if ( isVowel(ch) ){
            System.out.println(ch + " is a vowel.");
        }else if ( isConsonant(ch) ){
            System.out.println(ch + " is a consonant.");
        }else{
            System.out.println(ch + " is not a valid letter.");
        }

        scanner.close();
    }

    private static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private static boolean isConsonant(char ch){
        ch = Character.toLowerCase(ch);
        return (ch >= 'a' && ch <= 'z') && !isVowel(ch);
    }
}
    

