package Week1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        double a = 0, b = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number: ");
        a = scan.nextDouble();
        b = scan.nextDouble();

        System.out.println("Total: " + a * b);

    }
}
