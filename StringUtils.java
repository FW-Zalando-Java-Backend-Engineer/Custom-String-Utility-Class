package com.example.exercises;

/**
 * 🧪 Custom String Utility Class (Beginner Edition)
 *
 * Problem Background:
 * In real-world apps, developers often create utility methods to perform repeated string transformations.
 * Today, you'll write such methods using ONLY the String methods we’ve covered.
 *
 * 🎯 Allowed String Methods:
 * - length(), trim(), toUpperCase(), toLowerCase()
 * - substring(), contains(), replace(), charAt()
 * - indexOf(), lastIndexOf(), split()
 * - equals(), equalsIgnoreCase(), hashCode()
 */
public class StringUtils {

    /**
     * Removes all spaces from the input string.
     */
    public static String removeSpaces(String input) {
        // Step 1: Use replace to remove all spaces
        return input.replace(" ", "");
    }

    /**
     * Capitalizes the first letter of the string and makes the rest lowercase.
     */
    public static String capitalizeFirstLetter(String input) {
        // Step 1: Trim leading/trailing whitespace
        input = input.trim();

        // Step 2: If the input is empty after trimming, return it as is
        if (input.isEmpty()) return input;

        // Step 3: Extract the first character and convert to uppercase
        String firstChar = input.substring(0, 1).toUpperCase();

        // Step 4: Extract the remaining characters and convert to lowercase
        String rest = input.substring(1).toLowerCase();

        // Step 5: Combine the two parts
        return firstChar + rest;
    }

    /**
     * Checks if the first and last characters of the string are the same (case-insensitive).
     */
    public static boolean startsAndEndsSameLetter(String input) {
        // Step 1: Trim spaces
        input = input.trim();

        // Step 2: If the string is empty, return false
        if (input.length() == 0) return false;

        // Step 3: Get the first and last characters
        char first = input.charAt(0);
        char last = input.charAt(input.length() - 1);

        // Step 4: Compare using equalsIgnoreCase
        return String.valueOf(first).equalsIgnoreCase(String.valueOf(last));
    }

    /**
     * Counts the number of words in a sentence.
     */
    public static int countWords(String sentence) {
        // Step 1: Trim the sentence to remove leading/trailing whitespace
        sentence = sentence.trim();

        // Step 2: If the sentence is now empty, return 0
        if (sentence.isEmpty()) return 0;

        // Step 3: Split the sentence by spaces
        String[] words = sentence.split(" ");

        // Step 4: Return the number of words (array length)
        return words.length;
    }

    /**
     * Returns the index of the second occurrence of a character.
     */
    public static int secondIndexOf(String input, char ch) {
        // Step 1: Find the first occurrence
        int first = input.indexOf(ch);

        // Step 2: If the character is not found at all, return -1
        if (first == -1) return -1;

        // Step 3: Find the second occurrence starting from first + 1
        return input.indexOf(ch, first + 1);
    }
}
