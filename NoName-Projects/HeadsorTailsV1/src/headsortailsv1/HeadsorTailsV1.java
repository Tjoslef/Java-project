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
	    int heads = 0;
	    int tails = 0;
	    int flipCount = 0;
	    int totalFlips = 0;
	    double randNum = 0.0;
	    Scanner in = new Scanner(System.in);

	    // Input number of coins flipped
	    System.out.println("How many times will the coin be flipped? ");
	    totalFlips = in.nextInt();

	    // Simulate flipping coins.
	    while(flipCount < totalFlips)
	    {
	    	//Random value between 0.0 (inclusive) and 1.0 (exclusive)
	        randNum = Math.random() * (1 + 0.0) + 0.0;
	        System.out.print(flipCount + "\t" + randNum);

	        if(randNum < 0.5)          //change to < 0.3
	        {
	            heads++;
	            System.out.println("\t heads");
	        }
	        else
	        {
	            tails++;
	            System.out.println("\t tails");
	        }
	        flipCount++;

	    }//end while

	    //Output number of heads and number of tails
	    System.out.println();
	    System.out.println("Number of Heads = " + heads);
	    System.out.println("Number of Tails = " + tails);
	}
}
    
    
}
