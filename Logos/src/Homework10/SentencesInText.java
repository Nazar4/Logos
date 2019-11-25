package Homework10;

import java.util.Scanner;

public class SentencesInText {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < text.length() - 1; i++)
        {
            if ((text.charAt(i+1) == '.' || text.charAt(i+1) == '!' ||
                    text.charAt(i+1) == '?') &&
                    !(text.charAt(i) == '.' || text.charAt(i) == '!' ||
                            text.charAt(i) == '?')) count++;
        }
        System.out.println(count);

    }
}