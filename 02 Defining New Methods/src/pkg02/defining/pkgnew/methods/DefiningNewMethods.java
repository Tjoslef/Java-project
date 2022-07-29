/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.defining.pkgnew.methods;
import java.math.BigDecimal;
/**
 *
 * @author kubrt
 */
public class DefiningNewMethods {

    /**
     * @param args the command line arguments
     */
    
    public static BigDecimal newmethod(double Diameter,double Mass){
        double gravity = 0.0;
        
        double Diameter1 = Diameter * 1000;
        gravity = (Mass * 6.67430e-10) / Diameter1;
        gravity = Math.round(gravity) / 100;
        BigDecimal bigDecimal = new BigDecimal(gravity);
        BigDecimal roundedWithScale = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        
        return roundedWithScale;
    }
    public static void title(){
        System.out.println("\t \tPlanetary data");
        System.out.println("Planet \t Diametry(km) \t Mass(kg) \t g(m/s^2)");
    }
    public static void number(){
        BigDecimal gravity1 =  newmethod(120536,5.68e26);
        System.out.println("Saturn \t 120,536  \t 5.68e26 \t" + gravity1);
    }
    public static void main(String[] args) {
        title();
        number();
    }
    
}
