package com.example.exercises;

/**
 * 🧪 Custom String Utility Class 
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
     *
     * Theory: Use .replace(" ", "") to remove spaces.
     * Use Case: Compacting user input (e.g., usernames).
     *
     * @param input the original string
     * @return a string with no spaces
     */
    public static String removeSpaces(String input) {
        return input.replace(" ", ""); // Removes all spaces
    }

    /**
     * Capitalizes only the first character of the string, rest in lowercase.
     *
     * Theory: Use substring(), toUpperCase(), toLowerCase().
     * Use Case: Proper formatting for names or titles.
     *
     * @param input the original string
     * @return a string with the first letter capitalized
     */
    public static String capitalizeFirstLetter(String input) {
        input = input.trim(); // Remove leading/trailing spaces
        if (input.isEmpty()) return input;

        String firstChar = input.substring(0, 1).toUpperCase();
        String rest = input.substring(1).toLowerCase();

        return firstChar + rest;
    }

    /**
     * Checks whether a string starts with the same letter as it ends with (case-insensitive).
     *
     * Theory: Use charAt(), equalsIgnoreCase().
     * Use Case: Symmetry checks or code validation.
     *
     * @param input the string to check
     * @return true if first and last character match (ignoring case)
     */
    public static boolean startsAndEndsSameLetter(String input) {
        input = input.trim();
        if (input.length() == 0) return false;

        char first = input.charAt(0);
        char last = input.charAt(input.length() - 1);

        return String.valueOf(first).equalsIgnoreCase(String.valueOf(last));
    }

    /**
     * Returns the word count in a sentence.
     *
     * Theory: Use .trim() and .split(" ") to break into words.
     * Use Case: Simple analytics or form checks.
     *
     * @param sentence input sentence
     * @return number of words
     */
    public static int countWords(String sentence) {
        sentence = sentence.trim();
        if (sentence.isEmpty()) return 0;

        String[] words = sentence.split(" ");
        return words.length;
    }

    /**
     * Finds the index of the second occurrence of a letter.
     *
     * Theory: Use .indexOf() to find first, then call it again starting from that index + 1.
     * Use Case: Simple position-based analysis.
     *
     * @param input input string
     * @param ch the character to find
     * @return index of second occurrence, or -1 if not found twice
     */
    public static int secondIndexOf(String input, char ch) {
        int first = input.indexOf(ch);
        if (first == -1) return -1;

        return input.indexOf(ch, first + 1);
    }
}
