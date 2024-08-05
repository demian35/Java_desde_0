/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3totaldinero;

import java.util.Scanner;

/**
 *
 * @author josed
 * Ejercicio para calcular el dinero total de tres personas
 */
public class Ejercicio3TotalDinero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada para el dinero persona 1
        Scanner dinero= new Scanner(System.in);
        System.out.println("Digite la cantidad de dinero de la persona 1");
        double persona1=dinero.nextDouble();
        
        //la persona dos tiene la mitad de dinero que la persona 1
        double persona2= persona1/2.00;
        
        //la persona tres tiene la mitad de dinero que la persona 1 y la mitad de dinero que la persona 2
        double persona3= (persona1+persona2)/2.00;
        
        //dinero total entre las tres personas
        double sumaTotal= persona1+persona2+persona3;
        
        System.out.println("El presupuesto de la persona 1 es de " + persona1 + ""
                + " ,El de la persona 2 es de " + persona2+ " y el de la persona 3 de "
        + persona3);
        
        System.out.println("La suma total del dinero es de: "+ sumaTotal);
                
    }
    
}
