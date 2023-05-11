/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author kubrt
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "    ";
        String sample1 = "45";
        String sample2 = "Yes";
        if (sample.trim().isEmpty()){
           System.out.println("Don't be quiet");
           System.out.println(sample1.length());
           if (sample2.indexOf("Yes") >= 0)
        {
            System.out.println("Why so positive?");
        }
           else {
            System.out.println("Why so negative?");
           }
        }
        System.out.println(sample2.substring(0));
        System.out.println(sample2.substring(0,2));
        System.out.println(sample2.compareTo(sample));
        //  Add examples below for the following methods:
        //    trim()
        //    length()
        //    indexOf with one and two parameters
        //    substring() with one and two parameters
        //    compareTo()
        //    any other String methods you'd like to try

    }
}
    
    

