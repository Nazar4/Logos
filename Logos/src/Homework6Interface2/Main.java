package Homework6Interface2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a and b: ");
        double a = scanner.nextInt();
        double b = scanner.nextInt();

        System.out.println(myCalculator.devide(a,b));
        System.out.println(myCalculator.minus(a,b));
        System.out.println(myCalculator.multiply(a,b));
        System.out.println(myCalculator.plus(a,b));
    }
}
