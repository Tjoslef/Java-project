/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author kubrt
 */



/**
 * Purpose:
 *
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
public class concact
{
    // instance variables
    private int pnume;
    private String name;
    private int pr;
    private int quantity;
    

    // Constructor for objects of class Music
    public concact(String n,int p, int q, int pn)
    {
        // initialize instance variables
        name = n;
        pnume = pn;
        pr = p;
        quantity = q;
        
    }

    public String getName()
    {
        return name;
    }
   
    public void setName(String n)
    {
        name = n;
    }
   
    public int getPrice()
    {
        return pr;
    }
    
    public void setPrice(int p)
    {
        pr = p;
    }
   
    public int getPnume()
    {
        return pnume;
    }
    
    public void setPnume(int p)
    {
        pnume = p;
    }
     public int getQuantity()
    {
        return quantity;
    }
    
    public void setQuantity(int q)
    {
        quantity = q;
    }
    
    public String toString()
    {
        String str = String.format( "%-25s %20s   %20s %20s", name,  pr , quantity , pnume);
        return str;
    }
}
