/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.pkg05.body.mass.index;
import java.util.Scanner;
/**
 *
 * @author kubrt
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your first and last name please");
           String userName = input.nextLine();
           System.out.println("Enter weight in pounds please");
           int weight = input.nextInt();
           System.out.println("First enter height in feet please");
           int height = input.nextInt();
           System.out.println("Second enter height in inches please");
           int height2 = input.nextInt();
           System.out.println("Body mass calturator");
           System.out.println("Name: " + userName);
           System.out.println("Weight " + weight);
           System.out.println("Height " + height);
           double weight1 = weight * 0.45359237;
           double height3 = height * 30.48 + height2 * 2.54;
           double BMI = weight1 / ((height3 /100) * (height3 / 100));
           System.out.println("Your BMI" + BMI);
           if (BMI < 18.5){
           System.out.println("Category:Underweight");
           } else if (BMI < 24.9){
           System.out.println("Category:Normal or Healthy Weight");
           } else if (BMI < 29.9){
           System.out.println("Category:Normal or Healthy Overweight");
           }else if (BMI > 29.9){
           System.out.println("Category:Obese");
           }
             int num = 0;
            while(num < 20)
            {
              System.out.print(num + " ");
              num += 4;
            }
            System.out.println(num);  
             
     
            String phoneNum1 = ("1234567890");
            String areaCode1 = phoneNum1.substring(3, 6);
            System.out.println(num);
            
}
}    

