/**
 * OOPS Banner Application.
 * 
 * Displays the word "OOPS" in a large ASCII art banner using asterisks
 * and spaces. Each line of the banner is printed individually to demonstrate
 * sequential print statements and string concatenation.
 * 
 * @author Developer
 * @version 2.0
 */
public class opps {
    
    /**
     * Main method to display OOPS banner.
     * Prints a 7-line ASCII art representation of "OOPS" using asterisks
     * and spaces for visual styling.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Line 1: Top border of letters
        System.out.println(" *  *   ***   ***   *** ");
        
        // Line 2: Upper middle section
        System.out.println("*  * * *   * *   * *   *");
        
        // Line 3: Middle section
        System.out.println("*  * * *   * *   * *   *");
        
        // Line 4: Center line
        System.out.println("*  * * *   * *   * *   *");
        
        // Line 5: Lower middle section
        System.out.println("*  * * *   * *   * *   *");
        
        // Line 6: Lower section
        System.out.println(" *  *   ***   ***   *** ");
        
        // Line 7: Bottom spacing
        System.out.println("");
    }
}
