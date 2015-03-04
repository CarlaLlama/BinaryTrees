import java.io.PrintStream;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of SimpleTreeWriter for printing a simple binary tree structure. 
 * 
 * @author Carla Wilby
 * @version 28/02/2015
 */
public class SimpleTreeWriterImpl implements SimpleTreeWriter {
private PrintStream p;

    public SimpleTreeWriterImpl(PrintStream stream){
	setDestination(stream);
    }

	/*
	 * Initialize stream
	 */
    public void setDestination(PrintStream stream){
    	p = stream;
    }
    
    int level = 0;
    List<BinaryTreeNode> nodeList;
    
	/*
	 * Write method for printing to screen and file
	 */
    public void write(BinaryTreeNode tree){
    	int height = tree.getHeight();

    	while(level<height){
    	//initializing things
		int spaceLength = ((tree.getLargest()).toString()).length();
		int firstSpaceCalc = ((int)((Math.pow(2, height-level))-1)/2)*spaceLength;
		int spaceCalc = ((int)(Math.pow(2, height-level))-1)*spaceLength;
		
		if(level == 0){
			nodeList = TreeUtils.levelZero(tree);
		}else{
			nodeList = TreeUtils.nextLevel(nodeList);
		}
		
		
			for(int i = 0; i < nodeList.size(); i++){
				//sort null or thing to print
				String thingToPrint = " ";
				if(!TreeUtils.isPlaceHolder(nodeList.get(i))){
					thingToPrint = ""+ nodeList.get(i).getItem();
				}else{
					for(int j = 1; j < spaceLength; j++){
						thingToPrint += " ";
					}
				}
				
				if(i == 0){
					for(int j = 0; j < firstSpaceCalc;j++){
						p.append(" ");
					}
					p.print(thingToPrint);		
				}else{
					for(int j = 0; j < spaceCalc;j++){
						p.append(" ");
					}
					p.print(thingToPrint);
				}
			}
			p.println();
			level++;
			write(tree);
		}
		
    }		

}
