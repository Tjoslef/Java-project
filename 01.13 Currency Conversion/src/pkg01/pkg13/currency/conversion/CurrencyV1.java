/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01.pkg13.currency.conversion;

/**
 *
 * @author kubrt
 * PROJECT TITLE: 01.013 currency conversion
 * PRPOSE OF PROJECT: calculation of currency conversion
 * VERSION or DATE: 25.10
 * HOW TO START THIS PROJECT:
 * WEB: exchangerate - url: http://www.exchangerate.com
 * AUTHORS: Josef Pasek
 * it went pretty smoothly 
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        //remaining variables below here
        double ngultrumSpent = 100000;
        double ngultrumExchangeRate = 75.10172;
        double dollarsSpentInBhutan = 0.0;
        double dollarsAfterBhutan = 0.0;        
        double ouguiyaSpent = 80000;
        double ouguiyaExchangeRate = 366.6058;
        double dollarsSpentInMauritania = 0.0;
        double dollarsAfterMauritania  = 0.0; 
        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
        // Mexico
        dollarsSpentInMexico = (pesosSpent/pesoExchangeRate);
        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;
        System.out.println("You spent in Mexico in pesos " + pesosSpent);
        System.out.println("You spent in Mexico in dollars " + dollarsSpentInMexico);
        System.out.println("Your budge after Mexico in dollars is " + dollarsAfterMexico);
        //Bhutam
        dollarsSpentInBhutan = ngultrumSpent/ngultrumExchangeRate;
        dollarsAfterBhutan = dollarsAfterMexico - dollarsSpentInBhutan;
        System.out.println("You spent in Bhutan in ngultrum " + ngultrumSpent);
        System.out.println("You spent in Bhutan in dollars " + dollarsSpentInBhutan);
        System.out.println("Your budge after Bhutan in dollars is " + dollarsAfterBhutan);
        //MAURITANIA
        dollarsSpentInMauritania = ouguiyaSpent/ouguiyaExchangeRate;
        dollarsAfterMauritania  = dollarsAfterBhutan - dollarsSpentInMauritania;
        System.out.println("You spent in Mauritania in ouguiya " + ouguiyaSpent);
        System.out.println("You spent in Mauritania in dollars " + dollarsSpentInMauritania);
        System.out.println("Your budge after Mauritania in dollars is " + dollarsAfterMauritania);


        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = 0; 		//how many items can be purchased
		int fundsRemaining1 = 0;  //how much of the budget is left
                totalItems1 = budget1/costItem1;
                fundsRemaining1 = budget1%costItem1;
		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = 0; 	//how many items can be purchased
		double fundsRemaining2 = 0.0;  	//how much of the budget is left
                totalItems2 = budget2/ (int)costItem2;
                fundsRemaining2 = budget2%costItem2;
		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

