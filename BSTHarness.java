import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
/**
 * Asks the user to input a sequence of integers, constructs a SimpleBST from them, and prints
 * it out.
 * 
 * @author Stephan Jamieson 
 * @version 25/2/2015
 */
public class BSTHarness {


	public static void main(String args[]) throws FileNotFoundException {
		/*
		 * Receiving tree one from user
		 */
        System.out.print("Enter a comma separated list of numbers for tree one: ");  
        Scanner scannerOne = new Scanner(System.in);
        scannerOne = new Scanner(scannerOne.nextLine()).useDelimiter("\\s*,\\s*");
        
        /*
		 * Receiving tree two from user
		 */
        System.out.print("Enter a comma separated list of numbers for tree two: ");
        Scanner scannerTwo = new Scanner(System.in);
        scannerTwo = new Scanner(scannerTwo.nextLine()).useDelimiter("\\s*,\\s*");
        
        
        /*
		 * Initialising tree one, writing to System.out and file
		 */
	    SimpleBST treeOne = new  SimpleBST(); 
        
        while (scannerOne.hasNextInt() ){
            treeOne.insert(scannerOne.nextInt());
        }
        System.out.println("Tree one:");
        SimpleBST.print(treeOne, new SimpleTreeWriterImpl(System.out));
        SimpleBST.print(treeOne, new SimpleTreeWriterImpl(new PrintStream(new File("T1.out"))));
    	scannerOne.close();
    	
        /*
		 * Initialising tree one, writing to System.out and file
		 */
    	SimpleBST treeTwo = new  SimpleBST();
	
    	while (scannerTwo.hasNextInt() ){
            treeTwo.insert(scannerTwo.nextInt());
        }
	    System.out.println("Tree two:");
        SimpleBST.print(treeTwo, new SimpleTreeWriterImpl(System.out));
        SimpleBST.print(treeTwo, new SimpleTreeWriterImpl(new PrintStream(new File("T2.out"))));
    	scannerTwo.close();
    	
    	printIfSimilar(treeOne, treeTwo);
    }
	
    /*
	 * Helper class for TreeUtils.similar() method
	 */
	public static void printIfSimilar(SimpleBST t1, SimpleBST t2){
		if(t1.similar(t2)){
			System.out.println("The trees are similar.");
		}else{
			System.out.println("The trees are not similar.");
		}
	}
}
