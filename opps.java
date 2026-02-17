/**
 * OOPS Banner Application with String.join() Optimization.
 * 
 * Displays the word "OOPS" in a large ASCII art banner using asterisks
 * and spaces. Each line of the banner is constructed using the String.join()
 * method with an empty delimiter to optimize memory efficiency compared to
 * traditional string concatenation with the + operator.
 * 
 * @author Developer
 * @version 3.0
 */
public class opps {
    
    /**
     * Main method to display OOPS banner using String.join().
     * Prints a 7-line ASCII art representation of "OOPS" using asterisks
     * and spaces. The String.join() method reduces memory overhead by avoiding
     * the creation of temporary String objects during concatenation.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Line 1: Top border of letters
        System.out.println(String.join("", " ", "*", "  ", "*", "   ", "*", "*", "*", "   ", "*", "*", "*", "   ", "*", "*", "*", " "));
        
        // Line 2: Upper middle section
        System.out.println(String.join("", "*", "  ", "*", " ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*"));
        
        // Line 3: Middle section
        System.out.println(String.join("", "*", "  ", "*", " ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*"));
        
        // Line 4: Center line
        System.out.println(String.join("", "*", "  ", "*", " ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*"));
        
        // Line 5: Lower middle section
        System.out.println(String.join("", "*", "  ", "*", " ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*", " ", "*", "   ", "*"));
        
        // Line 6: Lower section
        System.out.println(String.join("", " ", "*", "  ", "*", "   ", "*", "*", "*", "   ", "*", "*", "*", "   ", "*", "*", "*", " "));
        
        // Line 7: Bottom spacing
        System.out.println(String.join("", ""));
    }
}
