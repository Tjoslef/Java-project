/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Arrays;
/**
 *
 * @author kubrt
 */
public class CitylWeatherV1 {
    private double[] temp;
    
    private double[] per;
    private String []Mounth;
    CitylWeatherV1(String []Mounth1,double[] temp1,double[] per1)
    {
        temp = temp1;
        per = per1;
        Mounth = Mounth1;
    }
    public double [] getTemp(){
    return temp;
    }
    public void setTemp(double[] temp1){
        temp = temp1;
    }
    public double [] getPer(){
    return per;
    }
    public void setPer(double[] per1){
        per = per1;
    }
    public String[] getMounth(){
    
        return Mounth;
    }
    public void setMounth(String []Mounth1){
       Mounth = Mounth1;
    }
    public double averageTemp (double[] temp1)
    {
      int length = temp1.length;
 
        // default sium value.
        int sum = 0;
 
        // sum of all values in array using for loop
        for (int i = 0; i < temp1.length; i++) {
            sum += temp1[i];
        }
 
        double average = sum / length;
         
        return average;
    
}
    public double sumPer(double[]per1)
    {
    double sum = 0.0;
    for (int i = 0; i < per1.length; i++) {
            sum += per1[i];
        }
    
    return sum;
    }
    public double [] conT (double[] temp1) {
        double [] newArr = new double[temp1.length];
        for (int i = 0;i < temp1.length; i++) {
            double hello = Math.round((temp1[i] - 32.0)* 5.0)/9 ;
            int num = i;
            newArr[num] = hello;
        }
        return newArr;
    }
    public double [] conPr (double [] per1) {
    double [] newArr = new double[per1.length];
        for (int i = 0;i < per1.length; i++) {
            double hello = Math.round(per1[i] / 2.54);
            int num = i;
            newArr[num] = hello;
        }
        return newArr;
    }
    }

    
