/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg09.pkg04.assignment;

/**
 *
 * @author kubrt
 */
import java.util.*;
public class shapesTester3
{
    public static void main(String []args)
    {
        Rectangle3 one = new Rectangle3(5, 20);
        Rectangle3 two = new Box3(4, 10, 5);
        Rectangle3 thi = new Cube4(5,9,6);
        Rectangle3 four = new cylinder(5,9,6);
        Rectangle3 five = new cone(5,9,6);
        //Print all shapes
        ArrayList<Rectangle3> shapes = new ArrayList<Rectangle3>();

        shapes.add(one);
        shapes.add(two );
        shapes.add(thi);
        shapes.add(four);
        shapes.add(five);
        for(Rectangle3 rect: shapes)
        {
        	System.out.println(rect);
        	//showEffectBoth(rect);
            System.out.println();
        }
        System.out.println(shapes.get(0));
       System.out.println("The Box is same size as Cube  " + two.equals(thi));
       System.out.println("The Box is same size as Rectangle  " + two.equals(one));
       System.out.println("The Box is same size as cone  " + two.equals(five));
       System.out.println("The Box is same size as cylinder " + two.equals(four));       
       System.out.println("The cylinder is same size as cylinder " + four.equals(four));     
       
       
       
    }
    
    public static void showEffectBoth(Rectangle3 r)
    {
        System.out.println(r);
    }
          
}
