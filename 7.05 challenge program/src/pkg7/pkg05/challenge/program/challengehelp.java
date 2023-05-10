/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg05.challenge.program;

/**
 *
 * @author kubrt
 */
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
public class challengehelp
{
    // instance variables
    private int Fscore;
    private int Sscore;
    private int Tscore;
    private int Foscore;
    private int Fiscore;
    private String name;
    

    // Constructor for objects of class Candidate
    public challengehelp(String name, int Fscore, int Sscore,int Tscore, int Foscore, int Fiscore)
    {
        // initialize instance variables
        this.name = name;
        this.Fscore = Fscore;
        this.Sscore = Sscore;
        this.Tscore = Tscore;
        this.Foscore = Foscore;
        this.Fiscore =Fiscore;
    }

    public String getName()
    {
        return name;
    }

    public int get1Score()
    {
        return Fscore;
        
    }
     public int get2Score()
    {
        return Sscore;
    }
      public int get3Score()
    {
        return Tscore;
    }
       public int get4Score()
    {
        return Foscore;
    }
        public int get5Score()
    {
        return Fiscore;
    }
    public void set1Score(int n)
    {
        Fscore = n;
    }
    public void set2Score(int n)
    {
        Fscore = n;
    }
    public void set3Score(int n)
    {
        Sscore = n;
    }
    public void set4Score(int n)
    {
        Tscore = n;
    }
    public void set5Score(int n)
    {
        Fiscore = n;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public String toString()
    {
        
        
        return String.format("%-5s %20s %18s %14s %14s %14s", getName(),get1Score(),get2Score(),get3Score(),get4Score(),get5Score());
        
    }
    
}

