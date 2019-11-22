package Homework10;

import Homework8.WrongInputConsoleParametersException;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) throws WrongInputConsoleParametersException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word with 5 letters: ");
        String word = scanner.next();
        verifyCountLetter(word);
        checkingPalindrome(word);
    }
    public static void checkingPalindrome(String word){
        StringBuffer stringBuffer = new StringBuffer(word);
        String word2 = String.valueOf(stringBuffer.reverse());
        if (word2.equalsIgnoreCase(word)) {
            System.out.println("Word is a palindrome");
        } else {
            System.err.println("Word isn't a palindrome");
        }}

    public static void verifyCountLetter(String word) throws WrongInputConsoleParametersException {
            if (word.length() != 5) {
                throw new WrongInputConsoleParametersException("Word must have 5 letters");
            }
        }
    }
