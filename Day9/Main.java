package Day9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name you want to reverse:");
        String name = scanner.next();

        String reversed = reverseString(name);

        System.out.println("Reversed String: " + reversed);

        if (name.equalsIgnoreCase(reversed)) { // compare ignoring case
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }

        scanner.close();
    }

    static String reverseString(String name) {
        String reversed = "";
        for (int index = name.length() - 1; index >= 0; index--) {
            reversed += name.charAt(index);
        }
        return reversed;
    }
}