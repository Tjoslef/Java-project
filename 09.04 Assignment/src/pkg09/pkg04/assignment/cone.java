/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09.pkg04.assignment;

/**
 *
 * @author kubrt
 */
public class cone extends Box3{
    public cone(int l, int w, int h)
    {
        // call superclass
        super(l, w,h);

        // initialize instance variables
        
    }

    // return the height
        
    public String toString()
    {
        return "The cone's dimensions are " + getLength() + " X " + getWidth() + " X ";
    }
    
    public boolean equals(Object obj) {
        return (this == obj);
                
    }
}
