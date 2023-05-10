/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06.pkg04.arrays.of.objects;

/**
 *
 * @author kubrt
 */
public class PriceTesterV10
{
   
   public static void main (String [] args) {
       int DifAge = 0; 
       double DifSize = 0.0;
       
       String name1 = "Jan 28, 2022";
       double priceH1 = 54.67;
       double priceL1 = 53.10;
       
       String name2 = "Jan 26, 2022";
       double priceH2 = 53.62;
       double priceL2 = 52.46;
       
       String name3 = "Jan 25, 2022";
       double priceH3 = 52.84;
       double priceL3 = 51.24;
       
       String name4 = "Jan 24, 2022";
       double priceH4 = 52.06;
       double priceL5 = 49.82;
       
       PriceV10[] prices = {new PriceV10(name1, priceH1,priceL1), new PriceV10(name2, priceH2,priceL2), new PriceV10(name3, priceH3,priceL3), new PriceV10(name4, priceH4,priceL5)};
     
       System.out.printf("%-10s %15s %15s %25s %n", "Date", "Price hight", "Price low", "Price average of day");
       System.out.println("====================================================================================");
       
       //prints the PlanetV10 array of objects using the toString() method
       for(PriceV10 p: prices) {
         double Dif = p.ComparisonA();
         System.out.println(p + " " + "\t" + Dif);
       }
         
   
   
   }
    
    
}
