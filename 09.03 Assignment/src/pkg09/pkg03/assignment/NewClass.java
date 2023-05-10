/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09.pkg03.assignment;

/**
 *
 * @author kubrt
 */
public class NewClass {
    public static void showCenter(Circle2 r)
    {
        System.out.println("For this " + r.getNames() + " " + r.getCenter());
        
    }
    
    public static void main(String []args)
    {
    Circle2[] data = new Circle2[4];
    data[0] = new Circle2(50,60,120);
    data[1] = new Cylinder2(50,60,120,10);
    data[2] = new Oval2(50,60,120,15);
    data[3] = new OvalCylinder2(50,60,120,15,32);
    System.out.println(data[0].getNames());
    System.out.println(data[1].getNames());
    System.out.println(data[2].getNames());
    System.out.println(data[3].getNames());
    showCenter(data[0]);
    showCenter(data[1]);
    showCenter(data[2]);
    showCenter(data[3]);
    System.out.println();
    
    
    
    
    
    
    
    
    }
}
