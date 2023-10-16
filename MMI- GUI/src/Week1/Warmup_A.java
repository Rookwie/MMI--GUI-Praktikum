package Week1;

import java.util.Scanner;

public class Warmup_A {
    public static void printStringStatistic(String input) {
        if (input.length() == 0) {
            System.out.println("Please input a valid String");
        } else {

            int consonantCount = 0;
            int vowelCount = 0;
            int spaceCount = 0;
            int digitCount = 0;
            int otherCount = 0;

            input = input.toLowerCase();

            for (int i = 0; i < input.length(); i++) {

                char index = input.charAt(i);

                if (Character.isDigit(index)) {
                    digitCount++;
                } else if (Character.isWhitespace(index)) {
                    spaceCount++;
                } else if (index == 'ä' || index == 'ö' || index == 'ü' || index == 'a' || index == 'e' ||
                        index == 'i' || index == 'o' || index == 'u' || index == 'y') {
                    vowelCount++;
                } else if (Character.isLetter(index)) {
                    consonantCount++;
                } else {
                    otherCount++;
                }
            }

            System.out.println("Your input has: ");
            System.out.println("Consonants: " + consonantCount);
            System.out.println("Vowels: " + vowelCount);
            System.out.println("Spaces: " + spaceCount);
            System.out.println("Digits: " + digitCount);
            System.out.println("Other characters: " + otherCount);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        printStringStatistic(input);
        scan.close();
    }
}