/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kubrt
 */
public class TreeV8_Tester {
    public static void main(String[] args){
        TreeV8 tree1 = new TreeV8("",150,80.0);
        TreeV8 tree2 = new TreeV8("",200,120.0);
        
        System.out.println("Type of tree \t age of the tree \t size of tree");
        System.out.println(tree1.getName() + "\t \t\t" + tree1.getAge() + "\t \t\t" + tree1.getSize());
        System.out.println(tree2.getName() + "\t\t\t" + tree2.getAge() + "\t\t\t" + tree2.getSize());
        System.out.println("the difference in age is " + tree1.Comparison(tree1.getAge(),tree2.getAge()) + "year");
        System.out.println("the difference in size is " + tree1.Comparison(tree1.getSize(), tree2.getSize()) + "meters");
    }
    
}
