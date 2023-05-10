/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package familycaltulating;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author kubrt
 * Josef Pasek
 * 1.12 2021
 * census of family and type of family
 * 
 */
public class Familycaltulating {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws IOException {
        String family = "";
        int doubleGirls = 0;
        int doubleBoys = 0;
        int mix = 0;
        double percentageOfMix = 0.0;
        double percentageOfGirls = 0.0;
        double percentageOfBoys = 0.0;
        int counterfamily = 0;
        File filename = new File("familyMembers.txt");
        Scanner inFile = new Scanner(filename);
        while(inFile.hasNext()){
            family = inFile.next( );
            if(family.equals("GG")) {
                doubleGirls++;
                }
            else if(family.equals("BB")){
                doubleBoys++;
            }
            else if(family.equals("GB") || (family.equals("BG"))){
                mix++;
            }
            counterfamily++;
            
        }
        percentageOfGirls = (double) doubleGirls / (double)counterfamily * 100;
        percentageOfMix = (double)mix / (double) counterfamily  * 100;
        percentageOfBoys = (double)doubleBoys / (double) counterfamily * 100;
        System.out.println("This is Statistics of how many family have two boy or two girls or one boy and one girl");
        System.out.println("total number of family " + counterfamily);
        System.out.println("Family with one boy and one girl " + mix + " Represent " + percentageOfMix + "%");
        System.out.println("Family with two girls " + doubleGirls + " Represent " + percentageOfGirls + "%");
        System.out.println("Family with two boys " + doubleBoys + " Represent " + percentageOfBoys + "%"); 
        
    }
    
}
