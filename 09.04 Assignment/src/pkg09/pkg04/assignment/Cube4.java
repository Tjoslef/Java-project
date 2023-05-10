/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09.pkg04.assignment;

/**
 *
 * @author kubrt
 */
public class Cube4 extends Box3 {
    public Cube4(int l, int w, int h)
    {
        // call superclass
        super(l, w,h);

        // initialize instance variables
        
    }

    // return the height
        
    public String toString()
    {
        return "The cube's dimensions are " + getLength() + " X " + getWidth() + " X ";
    }
}
