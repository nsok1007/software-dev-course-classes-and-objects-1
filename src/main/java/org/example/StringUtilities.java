package org.example;

public class StringUtilities {

    // ALL TESTS PASSED :D


    // Refer to Java Basics 1 for common string methods

    // Add a static function called shortString that takes a String parameter and returns true if the string has fewer than 5
    // characters

    public static boolean shortString(String word) { // boolean - returns boolean; void - returns NOTHING
        if (word.length() < 5) {
            return true;
        } else {
            return false;
        }
    }

    // Add a static function called firstLetter that takes a String parameter and returns the first character of the string

    public static char firstLetter(String fletter) { // char returns a character
        return fletter.charAt(0);
    }

    // Add a static function called censorAsparagus that takes a String parameter and returns the string with all instances of
    // "asparagus" (lowercase only) replaced with 4 stars: "****"

    public static String censorAsparagus(String message) {
        // methods I need:
        // replace() -- replaces each substring of this string that matches given the regular expression w/ replacement
        // toLowerCase() -- converts string to lowercase

        // If asparagus is found AND lowercase --> replace w/ 4 stars; if asparagus is found and uppercase --> DO NOTHING

        if (message.toLowerCase().contains("asparagus")) {
           return message.replace("asparagus", "****");
        } else {
            return message.replace("asparagus", "");
        }
    }

    // Add a static function called bigger that takes two String parameters and returns the longer of the two strings. If the
    // strings are the same length, return the first string.

    public static String bigger(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        } else if (b.length() > a.length()) {
            return b;
        } else {
            return a;
        }
    }
}
