/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09.pkg02.assignment;

/**
 *
 * @author kubrt
 */
public class Forest extends Terrain{
    private int ThNumber;
    public Forest(int length, int width, int NumberTh){
    super(length,width);
    ThNumber = NumberTh;
    }
    public int getThnumber(){
    return ThNumber;
    }
}
