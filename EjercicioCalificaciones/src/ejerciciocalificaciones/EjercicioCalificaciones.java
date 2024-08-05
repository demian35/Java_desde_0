/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocalificaciones;

import java.util.Scanner;

/**
 *
 * @author josed
 * Ejercicio para sacar la suma de tres calificaciones
 */
public class EjercicioCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // entrada donde se guardaran las entradas del usuario
        Scanner entrada= new Scanner(System.in);
        float cal1,cal2,cal3,cal4; //variables donde se guardaran las calificaciones
        System.out.println("Ingrese las calificaciones:");
        cal1=entrada.nextFloat();
        cal2=entrada.nextFloat();
        cal3=entrada.nextFloat();
        cal4=entrada.nextFloat();
        
        
        float sumaCal=cal1+cal2+cal3+cal4;
        
        System.out.println("La suma de las tres calificaciones es de: " + sumaCal); //imprimimos el resultado
    }
    
}
