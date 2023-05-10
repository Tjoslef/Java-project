/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09.pkg02.assignment;

/**
 *
 * @author kubrt
 */
public class GameTerrainTester {
    public static void main(String []args)
    {

        Terrain one =  new Terrain(100,200);
        Mountain two = new Mountain (10,125,225);
        Forest three =  new Forest(15,111,200);
        WinterMountain four =  new WinterMountain(0,15,133,200);

        // Circle
        System.out.println("");
        System.out.println("" + one.getTerrainSize());
        	                  
        System.out.println();

        // Cylinder
        System.out.println("number of mountain ");
        System.out.println(" is " + two.getNumberM() + "mountain " + two.getTerrainSize());
        System.out.println();

        // Oval
        System.out.println("number of forest  ");
        System.out.println(" is " + three.getThnumber() + " and forest " + three.getTerrainSize()
        	                  );
        System.out.println();

        // Oval Cylinder
        System.out.println("WinterMountain has temperature " + four.getTemperature() + "and number of mountain is " + four.getNumberM()
         + " winter mountain " + four.getTerrainSize());
        System.out.println("");
        System.out.println();
    }
}
