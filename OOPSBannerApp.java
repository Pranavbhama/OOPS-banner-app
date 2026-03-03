/**
 * OOPSBannerApp - UC6: Static Functions & Modularity
 * Encapsulates character patterns into reusable static methods.
 * @author Pranav
 * @version 6.0
 */
public class OOPSBannerApp {

    // Helper method for letter 'O'
    public static String getLineO(int line) {
        String[] pattern = {"  ***", " * *", " * *", " * *", " * *", " * *", "  ***"};
        return pattern[line];
    }

    // Helper method for letter 'P'
    public static String getLineP(int line) {
        String[] pattern = {"****", " * *", " * *", "****", " * ", " * ", " * "};
        return pattern[line];
    }

    // Helper method for letter 'S'
    public static String getLineS(int line) {
        String[] pattern = "****", "* ", "* ", "****", "   *", "   *", "****"};
        // Note: You can adjust these strings to match your preferred alignment
        String[] sRows = {"****", "* ", "* ", "****", "   *", "   *", "****"};
        return sRows[line];
    }

    public static void main(String[] args) {
        // UC6: Building the banner by invoking static helper methods
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            // We reuse getLineO(i) for both 'O's in OOPS
            bannerLines[i] = String.join(" ", getLineO(i), getLineO(i), getLineP(i), getLineS(i));
        }

        // Loop-based rendering for the final display
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}