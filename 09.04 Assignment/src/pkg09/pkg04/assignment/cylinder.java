package pkg09.pkg04.assignment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kubrt
 */
public class cylinder extends Box3{
    public cylinder(int l, int w, int h)
    {
        // call superclass
        super(l, w,h);

        // initialize instance variables
        
    }

    // return the height
        
    public String toString()
    {
        return "The cylinder's dimensions are " + getLength() + " X " + getWidth() + " X ";
    }
    public boolean equals(Object obj) {
        return (this == obj);
    }
}
