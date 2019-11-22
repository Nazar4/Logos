package Homework10;

import java.util.Scanner;

public class SentencesInText {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char textChar = text.charAt(i);
            if (textChar == '.') {
                count++;
            }
        }
        System.out.println(count);


    }
}