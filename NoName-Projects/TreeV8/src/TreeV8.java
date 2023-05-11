/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kubrt
 */
public class TreeV8 {
    private double SizeTree;
    
    private int AgeTree;
    private String NameTree;
    
    
    
    /**
     *
     * @param Size1
     * @param Size
     * @param Age
     * @param Age1
     * @param Name
     * @param Name1
     */
    TreeV8(String Name,int Age,double Size)
    {
        SizeTree = Size;
        AgeTree = Age;
        NameTree = Name;
    }

    

    

    
    
    public String getName(){
    
        return NameTree;
    }
    
    public void setAge(int Age){
       AgeTree = Age;
    }
    
    public int getAge(){
    
        return AgeTree;
    }
    
    public void setSize(double Size){
       SizeTree = Size;
    }
    public double getSize(){
        return SizeTree;
    }
    
     public int Comparison (int Age ,int Age1)
    {
       int difference = 0;
       if(Age < Age1){
           difference = Age1 - Age;
           
       }
       else{
           difference = Age - Age1;
       }
       return difference;
    }
     public double Comparison(double Size1,double Size)
    {
       double difference = 0;
       if(Size1 < Size){
           difference = Size - Size1;
       }
       else{
           difference = Size1 - Size;
       }
       return difference;
    }



}