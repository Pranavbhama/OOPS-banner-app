/**
 * OOPSBannerApp - UC4: Array & Loops
 * @author Pranav
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Using String.join from UC3 to maintain memory efficiency
        String[] bannerLines = {
            String.join(" ", "  ***", "   *** ", "****", "****"),
            String.join(" ", " *    *", "*   *", "*  *", "* "),
            String.join(" ", " *    *", "*   *", "*  *", "* "),
            String.join(" ", " *    *", "*   *", "****", "****"),
            String.join(" ", " *    *", "*   *", "* ", "     *"),
            String.join(" ", " *    *", "*   *", "* ", "     *"),
            String.join(" ", "  ***", "   *** ", "* ", " ****")
        };

        // 2. Looping Structure: Using an enhanced for-loop for cleaner output
        for (String line : bannerLines) {
            System.out.println(line);
    }
}