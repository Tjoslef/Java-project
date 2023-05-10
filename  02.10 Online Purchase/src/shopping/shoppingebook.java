/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;
import java.util.Scanner;

/**
 *
 * @author kubrt
 * 
 */
public class shoppingebook {
    public static void main(String[ ] args)
    {
     
     Scanner myObj = new Scanner(System.in);
     System.out.println("Hello my name is Doctor Who. What is your first and second name please");
     String firstname = myObj.nextLine();
     String secondname = myObj.nextLine();
     System.out.println("You know I'm a time lord, so please enter today's date.(mm/dd/yyyy)");
     String date = myObj.nextLine();
     System.out.println("We have this items on our store:book of time,book of nature,book of Galaxy "
             + "Please enter what do you want.");
     String book = myObj.nextLine();
     System.out.println("You can buy only one book that our rule so your price is 20 euros");
     System.out.println("Please enter your debit card number");
     int ndebit = myObj.nextInt();
     System.out.println("I will summarize your order;");
     System.out.println("Your name is" + firstname + secondname);
     System.out.println("Today date " + date);
     System.out.println("Your order is" + book);
     System.out.println("Your price is 20 euros");
     System.out.println("Your debit card" + ndebit);    
}
}