
import java.util.Arrays;
import java.io.*;
import java.lang.*;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kubrt
 */
public class arrayList {
    
    public static void main(String[] args) {
       String[] mascots = { "Knights", "Seminoles", "Bulls", "Gators" };
    int n = -1;
String str = "";

for (String m : mascots)
{
   n = m.indexOf("o") + 2;
   str += m.substring(n);
}
System.out.println(str);
        }
        
    
}
