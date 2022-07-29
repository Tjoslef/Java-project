/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package headsortailsv1;
import java.util.Scanner;
/**
 *
 * @author kubrt
 */
public class HeadsorTailsV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
/**
 * This program models flipping an unbiased coin and counting the
 * number of times heads or tails occurs.
 *
 * @author Charles Babbage 
 * @version 06/05/17
 */


	
	    // Declare and initialize variables
	    int pickCount = 0;
            double randNum = 0.0;
	    // Simulate flipping coins.
	    while(pickCount < 10)
	    {
	    	//Random value between 0.0 (inclusive) and 1.0 (exclusive)
	        randNum = Math.random() * (1 + 0.0) + 0.0;
	        System.out.print(pickCount + "\t" + randNum);

	        if(randNum < 0.2)          //change to < 0.3
	        {
	            
	            System.out.println("\t red");
                    pickCount ++;
	        }
	        else
	        {
	            pickCount ++;
	            System.out.println("\t blues");
	        }
	        

	    }//end while

	    
	}
}
    
    
}
