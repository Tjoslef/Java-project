/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08.pkg05.catapult.trajectory;

/**
 *
 * @author kubrt
 */
public class CatapultTrajectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NewClass[] data = new NewClass[1];
        int [] speedArray = {100,110,150,160,170,180};
        int [] angleArray = {100,110,120,130,140,150};
        data[0] = new NewClass(speedArray,angleArray);
        data[0].calcDistance(speedArray,angleArray);
        printData(data[0].calcDistance(speedArray,angleArray),speedArray,angleArray);
    }
    public static void printData(double[][] r,int [] speedArray,int [] angleArray){
    String speed = "MPH";
    String angle = "degree";
    for(int i = 0; i <  angleArray.length; i++){
    
    System.out.printf("%20s", angleArray[i] + speed);
    
    }   
    System.out.printf("\n");
    for(int row = 0; row < r.length; row ++)
        {
            
            System.out.printf("%5s ", speedArray[row] + angle);
          
            for(int col = 0; col < r[row].length; col ++)
            {
                System.out.printf("%20s", r[row][col]);
                
            }
            System.out.println();
        }
    System.out.println("angle");
    
    /*for(int row = 0; row < r.length; row ++){
        System.out.printf("\t"); 
        System.out.printf("%20s", r[row][0]);
    }
   */ 
    }
}
