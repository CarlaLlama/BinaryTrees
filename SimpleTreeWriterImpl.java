import java.io.PrintStream;
import java.lang.Math;

/**
 * Implementation of SimpleTreeWriter for printing a simple binary tree structure. 
 * 
 * @author Carla Wilby
 * @version 28/02/2015
 */
public class SimpleTreeWriterImpl implements SimpleTreeWriter {
PrintStream p;

    public SimpleTreeWriterImpl(PrintStream stream){
	setDestination(stream);
    }

    public void setDestination(PrintStream stream){
    	p = new PrintStream(stream);
    }

    int num = 1;
    
    public void write(BinaryTreeNode tree){
    	if(num%2==1){
	    p.println("Tree one:");
	    num++;
	}else{
	    p.println("Tree two:");
	    num++;
	}
	int level = 1;
	int height = tree.getHeight();
	int spaceLength = ((tree.getLargest()).toString()).length();
	int spaceCalc = 2*Math.pow(height-level)-1;
	int firstSpaceCalc = (2*Math.pow(height-level)-1)/2;
	
	while(level>=height){
	    p.format("%"+firstSpaceCalc+"s",tree+"");
	    int i = 1;
	    while(2*Math.pow(level)-i>=0){
		//WHAT AM I DOING?!
		i++;
	    }
	}
    }
}
