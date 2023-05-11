/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kubrt
 */
public class Tester1 {


public static void main(String[] args) {
{
    ArrayList<Double> aList = new ArrayList<Double>(3);
    aList.add(3.5);
    aList.add(4.3);
    aList.add(1, 12.3);
    aList.set(2, 18.9);
    aList.remove(1);
    aList.set(0, -20.3);
    aList.remove(1);
    aList.add(24.8);
    System.out.println(aList.size());
}
}

}
