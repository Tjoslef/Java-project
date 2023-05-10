/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09.pkg07.pkgclass.variables.and.constants;

/**
 *
 * @author kubrt
 */
public class Encryption {
    private int shifht;
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public Encryption(int shift){
    shifht = shift;
    
    }
    public static String encryption(int shift){
        String alphabetC = "";
       
        for(int i = 0; alphabetC.length() <= alphabet.length();i ++){
        i = Math. abs(i - shift);
        
        alphabetC += alphabet.substring(i);
        
        }
        return alphabetC.substring(0,27);
        
    }
}
