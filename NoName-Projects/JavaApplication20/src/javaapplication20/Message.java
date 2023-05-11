/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;
import org.apache

/**
 *
 * @author kubrt
 */
public class Message{
     private String message;
     private int idLength;
     private String deviceID;
     private int msgLength;
     private String textMsg;
     private int numberofW;
     private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
     Message(String pmessage){
        this.message = pmessage;
        }
     //public Message(String msg){
         
     //}

     public boolean isValid(String pmessage){
     boolean hv = false;
     int dh = 0;
     String number1 = pmessage.substring(0,2);
     String number2 = pmessage.substring(0,1);
     int firstTwoNumber = 0;
     int number = 0;
       if(isNumeric(number1)){
         firstTwoNumber = Integer.parseInt(number1);
         hv = true;
         dh = pmessage.substring(firstTwoNumber + 3).length();
         numberofW = dh;
         number = pmessage.substring(2,firstTwoNumber + 2).length();
         if(firstTwoNumber == number){
            hv = true;
            
         }
         else{
           hv = false;
         }
     
     }
     else if(isNumeric(number2)){
         firstTwoNumber = Integer.parseInt(number2);
         hv = true;
         dh = pmessage.substring(firstTwoNumber + 3).length();
         number = pmessage.substring(2,firstTwoNumber + 2).length();
         numberofW = dh;
         if(firstTwoNumber == number){
            hv = true;
            
         }
         else{
           hv = false;
         }
     } 
     else{
         hv = false;
     
     }
     if(dh >= 1){
         hv = true;
     }
     else {
        hv = false;
     }
     return hv;
     }
     public int numberofwords(String pmessage) {
        boolean it = isValid(pmessage);
        return numberofW;
     }
     
     

    

 
}