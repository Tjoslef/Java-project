/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author kubrt
 */
public class HelpClass1 {

    public static void main(String[] args){

String[][] names = {{"Abby", "Bobby", "Charles", "David"}, {"Eric", "Faith", "Gina", "Hope"}, {"Ines", "Juan", "Karl", "Lily"}};
          
          for(int b = 1; b < names[0].length-1; b++){
     for(int a = 1; a < names.length; a++){
           System.out.print(names[a][b] + " ");
     }
}
     }
}
