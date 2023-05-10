/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09.pkg07.pkgclass.variables.and.constants;

/**
 *
 * @author kubrt
 */
public class Decryption {
       private String text = "0";
       private int shift = 0;
    public Decryption(int shiftt,String textt){
    shiftt = shift;
    textt = text;
    }
    public static String Decryption(int shift,String textt){
        String alphabetC = "";
       
        for(int i = 0; alphabetC.length() <= textt.length();i ++){
        i = Math.abs(i - shift);
        
        alphabetC += textt.substring(Math.abs(i));
        
        }
        return alphabetC;
        
    }
}
