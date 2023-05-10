/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

import java.util.Arrays;

/**
 *
 * @author kubrt
 */
public class Tester {


public static void main(String[] args) {
double [] times = {22,23,22.5,21.5,22.3};
double [] anotherArray = new double[times.length - 2];
double minValue = times[0];
int a = 0;
  for(a=1;a<times.length;a++){
    if(times[a] < minValue){
      minValue = times[a];
    }
  }
double maxValue = times[0];
int i;
  for(i=1;i < times.length;i++){
    if(times[i] > maxValue){
      maxValue = times[i];
      
    }
    }
 double sum = 0.0;
 double average = 0.0;
for (int x = 0; x < times.length; x++) {
            sum += times[x];
        }
        sum -= maxValue + minValue;
        average = sum / (times.length - 2);
        System.out.println("average, excluding the maximum and minimum values" + average);
        }

}

