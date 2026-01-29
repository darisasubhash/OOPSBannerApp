/**
 * OOPSBannerApp – Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
 * such as the Collections Framework to manage character patterns in a more flexible
 * and efficient manner. The application retrieves and displays the "OOPS" banner
 * using a HashMap thereby enhancing code organization and modularity.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.HashMap;

public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     * Each character is mapped to an array of strings where each string represents
     * one line of the character's ASCII art pattern.
     *
     * @return HashMap with keys as characters and values as String arrays
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for letter 'O'
        charMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for letter 'P'
        charMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        // Pattern for letter 'S'
        charMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        // Pattern for space character
        charMap.put(' ', new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        });

        return charMap;
    }

    /**
     * Displays the banner message using the provided character map.
     * Renders the message line by line by horizontally combining character patterns.
     *
     * @param message the text message to be displayed as a banner
     * @param charMap HashMap containing character patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        // All patterns are assumed to have the same height
        int patternHeight = charMap.get('O').length;

        // Loop through each line of the pattern
        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            // Loop through each character in the message
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[line]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main entry point of the application.
     */
    public static void main(String[] args) {

        // Create character pattern map
        HashMap<Character, String[]> charMap = createCharacterMap();

        // Message to display
        String message = "OOPS";

        // Display banner
        displayBanner(message, charMap);
    }
}
