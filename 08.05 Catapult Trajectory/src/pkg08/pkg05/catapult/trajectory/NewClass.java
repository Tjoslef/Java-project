/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.pkg05.catapult.trajectory;

/**
 *
 * @author kubrt
 */
public class NewClass {
    private int [] speed;
    private int [] distance;
    
    public NewClass(int [] sp, int [] dis){
    speed = sp;
    distance = dis;
    }
    public double[][] calcDistance(int [] speed, int [] angle){
    double [][] distance = new double [6] [6];
    double G = 6.673e-11;
    double M = 5.98e24;
    for(int num = 0; num < distance.length; num ++){
     for(int num1 = 0; num1 < distance.length; num1 ++)
            {
               distance [num] [num1] = Math.abs((speed[0] * speed[0]) * Math.sin(2 * (Math.toRadians(angle[num1]))) / 9.8);
                       
                            }
    
    }
    return distance;
    }
    

}
