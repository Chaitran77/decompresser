package com.kiranthepro;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the letter:");
        String letter = scanner.next().replaceAll("\\s", "");

        System.out.println("Type the number:");
        int totalLettersToPrint = Integer.parseInt(scanner.next());

        String[] alphabet = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };

//        String alphabet_str = "abcdefghijklmnopqrstuvwxyz";
//        System.out.println(String.join("", Arrays.copyOfRange(alphabet, 10, 21)));
//        System.out.println(getElementIndex(alphabet, "z"));

        int lettersRemaining = totalLettersToPrint;

        if ((ArrayUtils.indexOf(alphabet, letter) + lettersRemaining) >= 25) {
            System.out.print(String.join("", Arrays.copyOfRange(alphabet, ArrayUtils.indexOf(alphabet, letter), 26)));
        }
//        while (lettersRemaining >= 26) { // must be equal to 26 because index number ends at 25
//            System.out.print(String.join("", Arrays.copyOfRange(alphabet, ArrayUtils.indexOf(alphabet, letter), ArrayUtils.indexOf(alphabet, letter)+(26-lettersRemaining))));
//            lettersRemaining -= (26-lettersRemaining);
//        }
//        System.out.print(String.join("", Arrays.copyOfRange(alphabet, ArrayUtils.indexOf(alphabet, letter), ArrayUtils.indexOf(alphabet, letter)+(26-lettersRemaining))));


    }

//    private static int getElementIndex(String[] array, String element) {
//        System.out.println(element);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//
//            if (array[i] == element) {
//                return i; // return element index
//            }
//        }
//        return -1; // element not found
//    }
}
