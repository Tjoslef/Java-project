/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09.pkg02.assignment;

/**
 *
 * @author kubrt
 */
public class WinterMountain extends Mountain{
    private int Temperature;
    public WinterMountain(int length, int width, int Mnumber, int Tem){
     super(length,width,Mnumber);
     Tem = Temperature;
    }
    public int getTemperature(){
    return Temperature;
    }
}
