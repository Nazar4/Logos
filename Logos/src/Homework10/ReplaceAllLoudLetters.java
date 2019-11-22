package Homework10;

public class ReplaceAllLoudLetters {

    public static void main(String[] args) {

        String name = "Play games for fun";
        System.out.println(name);
        System.out.println(name.replaceAll("[auioeAUIOE]", "-"));
    }
}
