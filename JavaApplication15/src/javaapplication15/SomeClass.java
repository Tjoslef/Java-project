/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

public class SomeClass
{
     
     public static void main(String[] args){
      
    HelpClass cal = new HelpClass();
    int [] triangle1 = {4,3,6,60,30,90};
    int [] triangle2 = {5,3,6,70,30,90};
    int num = 0;
    int num1 = 0;
    
    
    for (int i = 3; i < triangle1.length; i++) {
        if(triangle1[i] == triangle2[i]){
            num += 1;
            if(num >= 2){
                System.out.println("the triangles have two equal angles");
            }
            
    }}
    if(cal.tri1(triangle1) == cal.tri1(triangle1)){
        num1 += 1;
    }
    else if(cal.tri2(triangle1) == cal.tri2(triangle1)){
        num1 += 1;
    }
    else if(cal.tri3(triangle1) == cal.tri3(triangle1)){
        num1 += 1;
    }    
    if(num1 >= 2){
                System.out.println(" pair of corresponding sides has the same ratio");
            }
    
    System.out.println(cal.tri1(triangle1));
    System.out.println(cal.tri2(triangle1));
    System.out.println(cal.tri3(triangle1));
    System.out.println(num);
    System.out.println(num1); 
     }
   }
