package com.example.exercises;

/**
 * 🧪 Custom String Utility Class
 *
 * Problem Background:
 * In many enterprise applications, teams write utility classes to simplify repetitive String operations.
 * You'll implement common reusable static methods similar to what Apache Commons StringUtils offers.
 *
 * Goal:
 * Build a few static utility methods for string manipulation, the kind you might use across many services.
 */
public class StringUtils {

    /**
     * Removes all non-alphanumeric characters from the input.
     * 
     * Theory: Use regular expression to match only allowed characters.
     * Use Case: Cleaning up usernames or slugs.
     *
     * @param input the string to sanitize
     * @return cleaned string with only letters and numbers
     */
    public static String removeNonAlphanumeric(String input) {
        // Use regex: "[^a-zA-Z0-9]"
        return null;
    }

    /**
     * Converts a string to camelCase.
     *
     * Theory: Capitalize all words after the first, no spaces.
     * Use Case: Generating variable names from user input.
     *
     * @param input the input sentence (e.g., "hello world")
     * @return camelCase version (e.g., "helloWorld")
     */
    public static String toCamelCase(String input) {
        // Step 1: Split by space
        // Step 2: Lowercase first word, capitalize the rest
        return null;
    }

    /**
     * Shortens a string to a given length and appends "..." if needed.
     *
     * Theory: Truncate to maxLength - 3 and append ellipsis.
     * Use Case: UI previews or shortened titles.
     *
     * @param input the original string
     * @param maxLength the max allowed length
     * @return truncated string with ellipsis if applicable
     */
    public static String truncateWithEllipsis(String input, int maxLength) {
        // Step 1: Check length
        // Step 2: Substring and append "..."
        return null;
    }
}