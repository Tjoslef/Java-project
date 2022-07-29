/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.pkg05.fibonacci;
import java.util.Scanner;
/**
 *
 * @author kubrt
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter nteger value");
        int nvalue = myObj.nextInt();
        System.out.println(fib(nvalue));
        if(asking().equals("Yes")){
        main(null);
        }
        else{
        System.out.println("bye");
        }
        }
    
    
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
    static String asking(){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Do you want next fib value");
    String ask = myObj.nextLine();
    
    return ask;
    }
}
