/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06.pkg05.magpie.lab;
import java.util.Scanner;
/**
 *
 * @author kubrt
 */
public class MagpieLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Magpie2 maggie = new Magpie2();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
    
}
