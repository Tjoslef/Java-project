/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg06.pkg04.arrays.of.objects;

/**
 *
 * @author kubrt
 * source:https://finance.yahoo.com/quote/PFE/history?p=PFE
 */

 
 
public class PriceV10
{
   private double priceH;
   private double priceL;
    private String date;

     
   
   //one parameter constructor, all private instance variables initialized
   public PriceV10(String Date) {
      date = Date;
   }

   //two parameter constructor
   public PriceV10(String Date, double priceL1, double priceH1){
      date = Date;
      priceH = priceH1;
      priceL = priceL1;

   }
   
   public String getDate(){
    
        return date;
    }
    
    public void setD(double priceL1){
       priceL = priceL1;
    }
    
    public double getL(){
    
        return priceL;
    }
    
    public void setIn(int priceH){
       priceH = priceH;
    }
    public double getH(){
        return priceH;
    }
    public void setYear(String Date){
       date = Date;
    }
    
    
    
   

   public double ComparisonA ()
    { 
        double ffinal = (priceL + priceH) / 2;
        return ffinal;
    }

   public String toString() {
   
      return String.format("%-10s %10.1f %15.2f", getDate(), getH(),getL());  
   }
    
}

