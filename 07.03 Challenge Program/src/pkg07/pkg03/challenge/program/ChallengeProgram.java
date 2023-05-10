/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07.pkg03.challenge.program;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
/**
 *
 * @author kubrt
 */
public class ChallengeProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("/media/kubrt/New Volume/APCS Course Files/Mod01 Assignments/07.03 Challenge Program/src/pkg07/pkg03/challenge/program/newfile.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file and define variables 
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        int [] category = new int[years.length];
        int [] arrymin = new int [3];
        int [] arrymax = new int [3];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        double min2 = Integer.MAX_VALUE;
        double max2 = Integer.MIN_VALUE;
        double aveC = 0.0;
        double avePr = 0.0;
        double aveWi = 0.0;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        // Transfer knot to mph
        for (int i = 0;i < windSpeeds.length; i++) {
            windSpeeds[i] = Math.round(windSpeeds[i] * 1.151);
            
        }
        // create array category of  Saphir-Simpson Wind Speed Scale
        for (int i = 0;i < windSpeeds.length; i++) {
            if(windSpeeds[i] >= 74 && windSpeeds[i] <= 95){
                category[i] = 1;
            }
            else if(windSpeeds[i] >= 96 && windSpeeds[i] <= 110){
                category[i] = 2;
                
            }
            else if(windSpeeds[i] >= 111 && windSpeeds[i] <= 129){
                category[i] = 3;
                
            }
            else if(windSpeeds[i] >= 130 && windSpeeds[i] <= 156){
                category[i] = 4;
                
            }
            else if(windSpeeds[i] >= 157){
                category[i] = 5;
                
            }
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("lower limit of range");
        int rangel = input.nextInt();
        System.out.println("hight limit of range");
        int rangeh = input.nextInt();
        //create a Hurricane ArrayList using the data above
        java.util.ArrayList<Hurricane> hurricane = new java.util.ArrayList<Hurricane>();
        int num = 0;
        for (int i = 0;i <  years.length; i++) {
            if(years[i] >= rangel && years[i] <= rangeh){
                hurricane.add(new Hurricane(years[i],names[i],months[i],category[i],pressures[i],windSpeeds[i]));
                
                aveC += category[i];
                avePr += pressures[i];
                aveWi += windSpeeds[i];
                // Minimal and Maximal
                if (category[i] < min){
                    min = category[i];}
                if (category[i] > max){
                    max = category[i];}
                
                if (pressures[i] < min1){
                    min1 = pressures[i];}
                if (pressures[i] > max1){
                    max1 = pressures[i];}
              
                if (windSpeeds[i] < min2){
                    min2 = windSpeeds[i];}
                if (windSpeeds[i] > max2){
                    max2 = windSpeeds[i];}
            
                if(category[i] == 1){
                 sum += 1;
                }
                if(category[i] == 2){
                 sum1 += 1;
                }
                if(category[i] == 3){
                 sum2 += 1;
                }
                if(category[i] == 4){
                 sum3 += 1;
                }
                if(category[i] == 5){
                 sum4 += 1;
                }
            }
        }
              DecimalFormat df = new DecimalFormat("###.##");
              aveC = aveC / hurricane.size();
              avePr = avePr / hurricane.size();
              aveWi = aveWi / hurricane.size();
              
              
                
                
        
        System.out.println(" \t \t \t Hurricanes" + rangel + "-" + rangeh);
        System.out.println("Year \t Hurricane \t Category \t Pressure(mb) \t Wind Speed(mph)");
        System.out.println("========================================================================");
         for(int i = 0; i < hurricane.size(); i ++)
        {
         Hurricane dataRecord = hurricane.get(i);
         System.out.println(dataRecord);
        }
         System.out.println("========================================================================");
         System.out.println(" \t Average \t      " + df.format(aveC) + "\t" + df.format(avePr) + "\t \t" + df.format(aveWi));
         System.out.println(" \t Minimal \t      " + df.format(min) + "\t \t " + min1 + "\t \t" + min2);
         System.out.println(" \t Minimal \t      " + df.format(max) + "\t \t " + max1 + "\t \t" + max2);
         System.out.println("\n");
         System.out.println("Summary of Categories");
         System.out.println("Cat 1:" + sum);
         System.out.println("Cat 2:" + sum1);
         System.out.println("Cat 3:" + sum2);
         System.out.println("Cat 4:" + sum3);
         System.out.println("Cat 5:" + sum4);
        }
        
        //print the data
     }
   

