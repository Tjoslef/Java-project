/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kubrt
 */
public class TreeV3_Tester {
    public static void main(String[] args){
        TreeV3 tree = new TreeV3();
        System.out.println("Type of tree \t age of the tree \t size of tree");
        System.out.println(tree.printName("Smrk ") + "\t \t\t" + tree.printAge(150) + "\t \t\t" + tree.printSize(80));
        System.out.println(tree.printName1("Jablon ") + "\t\t\t" + tree.printAge1(200) + "\t\t\t" + tree.printSize(120));
        System.out.println("the difference in age is " + tree.ageComparison(150,200) + "year");
        System.out.println("the difference in size is " + tree.sizeComparison(80, 120) + "meters");
    }
    
}
