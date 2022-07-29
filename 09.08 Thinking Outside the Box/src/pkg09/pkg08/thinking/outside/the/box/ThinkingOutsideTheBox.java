/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg09.pkg08.thinking.outside.the.box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kubrt
 */
public class ThinkingOutsideTheBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter please hight number");
        int hight = myObj.nextInt();
        System.out.println("Enter please low number");
        int low = myObj.nextInt();
        ArrayList<Integer> number = cal.counting(low, hight);
        System.out.println(Arrays.toString(number.toArray()));
        System.out.println(number.size());
        
    }
    
}
