/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakecal;

/**
 *
 * @author kubrt
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        
        String flavor1 = "Blueberry";
        int quantity = 9;
        
        String flavor2 = "Banana";
        int quantity2 = 3;
        
        String flavor3 = " New York";
        int quantity3 = 4;
        
        String flavor4 = " Chocolate ";
        int quantity4 = 5;
        
        String flavor5 = " Carrot ";
        int quantity5 = 2;
        
        String flavor6 = " Chocolate ";
        int quantity6 = 7;
        
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
        cake.add(new CheeseCakeV1(flavor1, quantity)); 
        cake.add(new CheeseCakeV1(flavor2, quantity2)); 
        cake.add(new CheeseCakeV1(flavor3, quantity3)); 
        cake.add(new CheeseCakeV1(flavor4, quantity4)); 
        cake.add(new CheeseCakeV1(flavor5, quantity5)); 
        cake.add(new CheeseCakeV1(flavor6, quantity6)); 
        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            dataRecord.calcCreamCheese();
            dataRecord.calcSugar();
            dataRecord.calcTotalServings();
            dataRecord.calcVanilla();
        }
        
        //printing the format of the table
        System.out.println("\t" + "|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println("\t" + "| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println("\t" + "|-------|----------|---------------|--------------|----------|-----------|-----------|");

        
        
        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            // print each CheeseCake's data
            CheeseCakeV1 dataRecord = cake.get(index);
            System.out.println("\t  "+ index + "\t     " + dataRecord);
        }
    }
}
