/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.pkg03.challenge.program;

/**
 *
 * @author kubrt
 */
package pkg08.pkg02.binary.search;


/**
 * Purpose:
 *
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
public class Concact
{
    // instance variables
    private int pnume;
    private String name;
    private String relation;
    private String birthday;
    private String email;

    // Constructor for objects of class Music
    public Concact(String n, String r, String b, int p, String e)
    {
        // initialize instance variables
        name = n;
        pnume = p;
        relation = r;
        birthday = b;
        email = e;
    }

    public String getName()
    {
        return name;
    }
   
    public void setName(String n)
    {
        name = n;
    }
   
    public String getRelation()
    {
        return relation;
    }
    
    public void setRelation(String a)
    {
        relation = a;
    }
   
    public int getPnume()
    {
        return pnume;
    }
    
    public void setPnume(int p)
    {
        pnume = p;
    }
     public String getBirthday()
    {
        return birthday;
    }
    
    public void setBirthday(String b)
    {
        birthday = b;
    }
     public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String e)
    {
        email = e;
    }
    public String toString()
    {
        String str = String.format( "%-25s %20s   %-20s %20s %10s ", name,  relation , birthday , pnume, email);
        return str;
    }
}
