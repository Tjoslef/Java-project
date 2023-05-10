/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kubrt
 */
public class CitylWeatherV1Tester {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "Apalachicola";  //choose a city from the table provided
        String state = "Florida";  //choose a city from the table provided
        double [] per2 = null;
        double [] temp2 = null;
        String [] month = {"Jan", "Feb","Mar", "Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec" };     //complete initialization of months array
        double [] precipitation ={4.9, 3.8,5.0,3.0,2.6,4.3,7.3,7.3,7.1,4.2,3.6,3.5};     //complete initialization of temperatures array
        double [] temperature ={52.7, 55.3,60.7,66.8,74.1,80.0,81.9,81.7,79.1,70.2,62.0,55.2};     //complete initialization of precipitation array
        
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
        CitylWeatherV1 oneYear = new CitylWeatherV1(month,temperature,precipitation);
        System.out.println(oneYear.averageTemp(temperature));
        System.out.println(oneYear.sumPer(precipitation));
        System.out.println(Arrays.toString(oneYear.conT((temperature))));
        System.out.println(Arrays.toString(oneYear.conPr((precipitation))));
        //input to decide F/C and in/cm - to be completed in 6.02
        System.out.println("Choose the temperature scale(F = Fahrenheit, Celsium = C) ");
        String Tscale = in.nextLine();
        if("F".equals(Tscale)){
             temp2 = temperature;
             
        
        }else if("C".equals(Tscale)){
            temp2 = oneYear.conT(temperature);
            tempLabel = "C";
        }
        System.out.println("Choose the precipitation scale(I = Inches, Centimeters = C) ");
        String Pscale = in.nextLine();
        if("I".equals(Pscale)){
            per2 = precipitation;
            
        }else if("C".equals(Pscale)){
             per2 = oneYear.conPr(precipitation);
             precipLabel = "cm";
        }
	System.out.printf("%20s %n", "Weather data");
        System.out.printf("%15s%30s%n", "Location: ", "Apalachicola, Florida");
        System.out.printf("%1s%30s%30s %n","Month" , "Temperature (" + tempLabel + ")", "Precipitation (" +precipLabel + ")");
        System.out.println("*********************************************************************");
        for (int i = 0;i < 12; i++){
        System.out.printf("%1s%30s%30s %n",month[i] , temp2[i], per2[i]);
        }
    
    }
    
}
