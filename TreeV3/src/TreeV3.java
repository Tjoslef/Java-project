/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kubrt
 */
public class TreeV3 {
    //private int SizeTree = 6;
    //private int SizeTree1 = 7;
    //private int AgeTree1 = 150;
    //private int AgeTree = 200;
    //private String NameTree = "Smrk";
    //private String NameTree1 = "Jablon";
    
    
    /**
     *
     * @param Size1
     * @param Size
     * @param Age
     * @param Age1
     * @param Name
     * @param Name1
     */
    TreeV3()
    {
        
    }

    

    

    String printName(String Name){
    
    return Name;
    }
    String printName1(String Name1){
    return Name1;
    }
    
    int printAge(int Age){
       return Age;
       
       
     }
    int printAge1(int Age1){
       
       return Age1;
       
     }
     int printSize(int Size1){
       return Size1;
       
       
     }
    int printSize1(int Size){
       
       return Size;
       
     }
     public int ageComparison (int Size1 ,int Size)
    {
       int difference = 0;
       if(Size < Size1){
           difference = Size1 - Size;
           
       }
       else{
           difference = Size - Size1;
       }
       return difference;
    }
     public int sizeComparison(int Age,int Age1)
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



}