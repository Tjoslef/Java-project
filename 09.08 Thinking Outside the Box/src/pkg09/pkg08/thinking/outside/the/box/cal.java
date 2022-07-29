/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09.pkg08.thinking.outside.the.box;

import java.util.ArrayList;

/**
 *
 * @author kubrt
 */
public class cal {
    private int low;
    private int hight;
    private int count = 0;
    public cal (int llow, int hhight){
    this.low  = llow;
    this.hight  = hhight;
    
    }
     public static ArrayList<Integer> counting(int llow, int hhight){
     ArrayList<Integer> primeN = new ArrayList<>();
     for(int i = llow; i <= hhight;i++){
         if(isPrime(i))
             primeN.add(i);
             int count1 = 0;
             count1 ++;
             
        }
     
     return primeN;
     }
     static boolean isPrime(int num)
{
    if (num <= 1)
        return false;
  
    for(int i = 2; i * i <= num; i++)
     
        // If a divisor of n exists
        if (num % i == 0)
            return false;
             
    return true;
}
}
