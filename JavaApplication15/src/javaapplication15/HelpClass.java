/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author kubrt
 */
public class HelpClass {
    HelpClass()
    {
       
    }
    public  double tri1(int [] triangle){
         double ratio = 0.0;
        
            if(triangle[0] > triangle[1]) {
                 ratio = (double) triangle[0] / (double) triangle[1];
            }
            else {
                ratio = (double) triangle[1] / (double) triangle[0];
            }
     
        return ratio;
     }
    public  double tri2(int [] triangle){
         double ratio = 0.0;
        
            if(triangle[1] > triangle[2]) {
                 ratio = (double) triangle[4] / (double) triangle[5];
            }
            else {
                ratio = (double) triangle[5] / (double) triangle[4];
            }
     
        return ratio;
     }
    public  double tri3(int [] triangle){
         double ratio = 0.0;
        
            if(triangle[3] > triangle[5]) {
                 ratio = (double) triangle[3] / (double) triangle[5];
            }
            else {
                ratio = (double) triangle[5] / (double) triangle[3];
            }
     
        return ratio;
     }
}
