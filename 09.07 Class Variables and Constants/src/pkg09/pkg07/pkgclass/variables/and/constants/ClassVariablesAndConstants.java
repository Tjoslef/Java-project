/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg09.pkg07.pkgclass.variables.and.constants;
import java.util.Scanner;
/**
 *
 * @author kubrt
 */
public class ClassVariablesAndConstants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Do you want Encryption or Decryption(En/De");
        String answer = myObj.nextLine();
        if(answer.equals("En")){
        System.out.println("Enter number between 0 - 25");
        int number = myObj.nextInt();
        String alphabet = Encryption.alphabet;
        String passport = Encryption.encryption(number);
        System.out.println("New alphabet" + passport + "\n" + "old alphabet" + alphabet);
        }
        else if(answer.equals("De")){
             System.out.println("Enter number between 0 - 25");
        int number = myObj.nextInt();
        System.out.println("next part");
        System.out.println("Enter your text");
        
        String text = myObj.nextLine();
        if(text.isEmpty() == false){
        String alphabet = Decryption.Decryption(number, text);
        System.out.println(" alphabet" + alphabet + "\n" + "text" + text);
        }
        else{
        System.out.println("Enter your text");
        text = myObj.nextLine();
        String alphabet = Decryption.Decryption(number, text);
        System.out.println(" alphabet" + alphabet + "\n" + "text: " + text);
        }
        }
    }
    
}
