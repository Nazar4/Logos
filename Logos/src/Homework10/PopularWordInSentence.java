package Homework10;

import java.util.Scanner;

public class PopularWordInSentence {

    public static void main(String[] args) {

        System.out.println("Enter sentence: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int a = s.split(" ").length;
        int i;
        String[] word = new String[a];
        for (i = 0; i < a; i++) {
            for (String text : s.split(".")) {
                word[i] = text;
                System.out.println(word[i]);
            }
        }
    }
}