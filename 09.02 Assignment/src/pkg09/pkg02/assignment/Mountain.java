/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg09.pkg02.assignment;

/**
 *
 * @author kubrt
 */
public class Mountain extends Terrain{
    private int Mnumber;

    /**
     *
     * @param length
     * @param width
     * @param numberM
     *
     */
    public Mountain(int length, int width, int numberM){ 
    super(length,width);
    Mnumber = numberM;
    
    }
    public int getNumberM(){
     return Mnumber;

}
}
