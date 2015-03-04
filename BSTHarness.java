import java.util.Scanner;
/**
 * Asks the user to input a sequence of integers, constructs a SimpleBST from them, and prints
 * it out.
 * 
 * @author Stephan Jamieson 
 * @version 25/2/2015
 */
public class BSTHarness {


	public static void main(String args[]) {
        System.out.print("Enter a comma separated list of numbers for tree one: ");  
        Scanner scannerOne = new Scanner(System.in);
        scannerOne = new Scanner(scannerOne.nextLine()).useDelimiter("\\s*,\\s*");
        System.out.print("Enter a comma separated list of numbers for tree two: ");
        Scanner scannerTwo = new Scanner(System.in);
        scannerTwo = new Scanner(scannerTwo.nextLine()).useDelimiter("\\s*,\\s*");
        
	SimpleBST tree = new  SimpleBST();
        
        while (scannerOne.hasNextInt() ){
            tree.insert(Integer.parseInt(scannerOne.nextInt()));
        }
        SimpleBST.print(tree, new SimpleTreeWriterImpl(System.out));
	
	while (scannerTwo.hasNextInt() ){
            tree.insert(Integer.parseInt(scannerTwo.nextInt()));
        }
        SimpleBST.print(tree, new SimpleTreeWriterImpl(System.out));
	
    	scannerOne.close();
    	scannerTwo.close();
    }

}
