package com.java101;

import java.util.Scanner;

public class Main {

    static boolean isPalindrome(int number) {
        int temp = number, reverse = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverse = (reverse * 10) + mod;
            temp /= 10;
        }
        return number == reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please type a number :");
        int number = input.nextInt();

        boolean result = isPalindrome(number);

        System.out.print("Number " + number + " is" + (result ? " palindrome." : " not palindrome"));
    }
}
