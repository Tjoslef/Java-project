/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09.pkg04.assignment;

/**
 *
 * @author kubrt
 */
public class Rectangle3
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle3(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

   
    public String toString()
    {
        return "The rectangle's dimensions are " + length + " X " + width;
    }
    
}
