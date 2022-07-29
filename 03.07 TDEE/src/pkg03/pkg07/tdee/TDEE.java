/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.pkg07.tdee;
import java.util.Scanner;
/**
 *
 * @author kubrt
 * Josef Pasek
 * 25.11
 * calculation of TDEE
 */
public class TDEE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double TDEE = 0.0;
        double AF = 0.0;
        System.out.println("Hello please");
        System.out.println("Select your activity level ");
        System.out.println("[C] Office work, sitting (e.g., walking");
        System.out.println("[D] Light manual labor (e.g., dancing)");
        System.out.println("[E] Hard manual labor (e.g., team sports");
        System.out.println("[F] Heavy manual labor (e.g., full-time athletes");
        System.out.println("Enter letter corresponding to your activity level: ");
        String choice = input.nextLine();
        System.out.println("Please enter your gender (f/m)");
        String gender = input.nextLine();
        System.out.println("Please tell me your name");
        String userName = input.nextLine();
        System.out.println("Please enter your BMR:");
        int BMR = input.nextInt();
       
        if((choice.equals("A")) && gender.equals("f")){
            AF = 1.0;
            TDEE = AF * BMR;
        }else if(gender.equals("f") && (choice.equals("B"))){
            AF = 1.3;
            TDEE = AF * BMR;
        }else if(gender.equals("f") && (choice.equals("C"))){
            AF = 1.5;
            TDEE = AF * BMR;
        }else if(gender.equals("f") && (choice.equals("D"))){
            AF = 1.6;
            TDEE = AF * BMR;
        }else if(gender.equals("f") && (choice.equals("E"))){
            AF = 1.9;
            TDEE = AF * BMR;
        }else if(gender.equals("f") && (choice.equals("F"))){
            AF = 2.2;
            TDEE = AF * BMR;
        }else if(gender.equals("m") && (choice.equals("A"))){
            AF = 1.0;
            TDEE = AF * BMR;
        }else if(gender.equals("m") && (choice.equals("B"))){
            AF = 1.3;
            TDEE = AF * BMR;
        }else if(gender.equals("m") && (choice.equals("C"))){
            AF = 1.6;
            TDEE = AF * BMR;
        }else if(gender.equals("m") && (choice.equals("D"))){
            AF =  1.7;
            TDEE = AF * BMR;
        }else if(gender.equals("m") && (choice.equals("E"))){
            AF =  2.1;
            TDEE = AF * BMR;
        }else if(gender.equals("m") && (choice.equals("F"))){
            AF = 2.4;
            TDEE = AF * BMR;
        }else{
        System.out.println("Oops you write something wrong");
        }
       
        System.out.println("Your results: ");
        System.out.println("Name " + userName);
        System.out.println("BMR: " + BMR + " calories");
        System.out.println("TDEE: " + TDEE + " calories");
        System.out.println("gender: " + gender);
        System.out.println("Active Factor: " + AF);
        
    }
    
}
