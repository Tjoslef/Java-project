/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09.pkg04.assignment;

/**
 *
 * @author kubrt
 */
public class Box3 extends Rectangle3
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box3(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    
    public String toString()
    {
        return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }
    public boolean equals(Object obj) {
        return (this == obj);
    }
    
}
