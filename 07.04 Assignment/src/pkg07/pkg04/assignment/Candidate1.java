/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07.pkg04.assignment;

import java.util.List;

/**
 *
 * @author kubrt
 */
public class Candidate1
{
    // instance variables
    private int numVotes;
    private String name;
    private int num;

    // Constructor for objects of class Candidate
    public Candidate1(String name, int numVotes)
    {
        // initialize instance variables
        this.name = name;
        this.numVotes = numVotes;
        
    }

    public String getName()
    {
        return name;
    }

    public int getVotes()
    {
        return numVotes;
    }

    public void setVotes(int n)
    {
        numVotes = n;
    }

    public void setName(String n)
    {
        name = n;
    }
    public String toString()
    {
        
        
        return String.format("%-5s %15s", getName(),getVotes());
        
    }
    
}
