package Homework10;

import java.util.Scanner;

public class CountSentences {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = scanner.nextLine();
        int count = 0;
        if(input.length() != 0){
            count++;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    count++;
                }
            }
        }
        System.out.println("You enter "+count+" words");
    }
}