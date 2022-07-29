/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.pkg06.password.generator;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author kubrt
 */
public class PasswordGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int number1 = 0;
        char passport2 = 0;
        
        String hello = "Y";
        File filename = new File("hello.txt");
        while(hello.equals("Y")){
            
            PrintWriter outFile;
            outFile = new PrintWriter("hello.txt");
            System.out.println("hello how many character you want in passport minimal is 6");
            number = input.nextInt(); 

                if(number > 6){
                    for (int loop = 0; loop < number; loop++){
                        number1 = (int) ((Math.random() * (140  - 35)));
                        passport2 += number1;
                        outFile.println(passport2);}
                System.out.println("Your passport was writed in file");
                
                }
            else{
            System.out.println("Your password will to weak");
            }
        outFile.close ( );
        System.out.println("Do you what new password(Y/N)");
        hello = input.next();
        
        }
        
        String token = "";
        Scanner inFile = new Scanner(filename);
        while( inFile.hasNext() )
        {
            token += inFile.next( );      //read next token from file
              //print value of token
        }
        System.out.println("here is your code" + token); 
    }
    
}
