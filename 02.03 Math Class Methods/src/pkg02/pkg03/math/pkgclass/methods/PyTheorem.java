/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.pkg03.math.pkgclass.methods;
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
/**
 *
 * @author Josef Pasek
 * Date: 27.10
 * Project: calculation of hypotenuse of two triangle
 * ***************************************************
 * l thing everything go well after importing package that l need
 */
public class PyTheorem {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        double hyp = 0.0;
        double hyp1 = 0.0;
        double a = ((Math.random() * (24 - 3)) + 4);
        System.out.println("first side of first triangle: " + a);
        double b = ((Math.random() * (24 - 3)) + 4);
        System.out.println("second side of first triangle: " + b);
        double a1 = ((Math.random() * (24 - 3)) + 4);
        System.out.println("first side of second triangle: " + a1);
        double b1 = ((Math.random() * (24 - 3)) + 4);
        System.out.println("second side of second triangle: " + b1);
        hyp = Math.sqrt((a*a)+(b*b));
        hyp1 = Math.sqrt((a1*a1)+(b1*b1));
        System.out.println("This is hypotenuse of first triangle: " + hyp);
        System.out.println("This is hypotenuse of second triangle: " + hyp1);
        System.out.println('8' + '2');
        System.out.println("128" + "32");         
        double num = 6;
        if(num % 10 != 0)
            System.out.print(num);
        if(true){}
        int weightLbs = 15;
        int heightCm = 15;
        int bMR = 15;
        System.out.println("Weight (kg): " + (int)(10 * weightLbs)/10.0 );
        System.out.println("Height (cm): " + (int)(10 * heightCm)/10.0 );
        System.out.println("Basal Metabolic Rate: " + (int)(10 * bMR)/10.0 );
    }
    
    
    
    
}
