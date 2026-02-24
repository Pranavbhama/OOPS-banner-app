/**
 * OOPSBannerApp - UC3: Memory Efficient Banner
 * Uses String.join() to construct the banner lines.
 * @author Pranav
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC3: Using String.join() to manage memory efficiency
        // Syntax: String.join("delimiter", "part1", "part2", ...)

        System.out.println(String.join("   ",
                " ***** ",
                " ***** ",
                " ******",
                " ***** "));

        System.out.println(String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*      "));

        System.out.println(String.join("   ",
                "*     *",
                "*     *",
                " ******",
                " ***** "));

        System.out.println(String.join("   ",
                "*     *",
                "*     *",
                "*      ",
                "      *"));

        System.out.println(String.join("   ",
                " ***** ",
                " ***** ",
                "*      ",
                " ***** "));
    }
}