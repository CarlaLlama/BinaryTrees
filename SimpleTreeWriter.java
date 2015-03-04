import java.io.PrintStream;
/**
 * Abstract definition of an object for printing a simple binary tree structure. 
 * 
 * @author Carla Wilby
 * @version 28/02/2015
 */
public interface SimpleTreeWriter{

    public void setDestination(PrintStream stream);
    
    public void write(BinaryTreeNode tree); 
}
