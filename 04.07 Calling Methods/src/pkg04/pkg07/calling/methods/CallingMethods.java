/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.pkg07.calling.methods;

import java.util.stream.IntStream;

/**
 *
 * @author kubrt
 */
public class CallingMethods {

    /**
     * @param args the command line arguments
     */
    public static int randomNumber() {
       int nada;
        nada = 1;
       int num = 0;
       while(nada == 1){ 
       
       num = (int) (Math.random() * (999 - 100) * 900 + 100);
       int num1;  
        num1 = (num % 10);
        
       int num2;
        num2 = (num / 100);
        
       if (num1 - num2 >= 2){
           nada = 0;
       }
       else{
           nada = 1;
   }
       }
    return num;
       }
    
    public static int reverseDigits (int numR) {
         int reversed = 0;

    // run loop until num becomes 0
    while(numR != 0) {
    
      // get last digit from num
      int digit = (Math.abs(numR) % 10);
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      numR /= 10;
    }
    
         return reversed;
    }   
    public static String replaceLtr(int num){
        String str1 = "";
        String str = Integer.toString(num);
        char[] ch=str.toCharArray();    
        for(int n = 0; n < str.length();n++){
            
            if(str.substring(n,n+1).equals("0")){
                 str1 += "Y";
            }
            else if(str.substring(n,n+1).equals("1")){
                 str1 += "M";
            }
            else if(str.substring(n,n+1).equals("2")){
                 str1 += "P";
            }
            else if(str.substring(n,n+1).equals("3")){
                 str1 += "L";
            }
            else if(str.substring(n,n+1).equals("4")){
                 str1 += "R";
            }
            else if(str.substring(n,n+1).equals("5")){
                 str1 += "O";
            }
            else if(str.substring(n,n+1).equals("6")){
                 str1 += "F";
            }
            else if(str.substring(n,n+1).equals("7")){
                 str1 += "A";
            }
            else if(str.substring(n,n+1).equals("8")){
                 str1 += "I";
                 
            }
            else if(str.substring(n).equals("9")){
                 str1 += "B";
        }
             
        }
        
        return str1;       
    }
    public static String reverseString(String str) {
		 char[] ch=str.toCharArray();  
                 String rev="";  
                 for(int i=ch.length-1;i>=0;i--){  
                 rev+=ch[i];  
                }
         return rev;
	}    
        
        
        
     
    
    public static void main(String[] args) {
        
        int num1 = randomNumber();
        System.out.println("Starting number: "+num1);
        int num2 = reverseDigits(num1);
        System.out.println("reversed number: " + num2);
        int num3 = 0;
        if (num2 > num1){
        num3 = num2 - num1;
        System.out.println("difference is: " + num3);
        }
        else{
        System.out.println("jakub");
        }
        num3 += reverseDigits(num3);
        System.out.println("number plus reversed number: " + num3);
        num3 = num3 * 1000000;
        System.out.println("Number X one million: " + num3);
        num3 = num3 - 733361573;
        System.out.println("Number subtraced by  733,361,573: ");
        System.out.println("Numbers replace by letters: " + replaceLtr(num3));
        
        String str4 = (replaceLtr(num3));
        System.out.println("Reverses letters: " + reverseString(str4));
        
    }
}