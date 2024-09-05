/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosueldomaximo;

import java.util.Scanner;

/**
 *
 * @author josed
 */
public class EjercicioSueldoMaximo {

    /**
     * @param args the command line arguments
     * programa para sacar el sueldo maximo 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroSueldos;
        int sueldo,sueldoMax=0,sueldoMin=Integer.MAX_VALUE;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de sueldos a registrar");
        numeroSueldos=entrada.nextInt();
        for(int i=1;i<=numeroSueldos;i++){
            System.out.println("Ingrese un sueldo");
            sueldo=entrada.nextInt();
            sueldoMax=Math.max(sueldoMax, sueldo);
            sueldoMin=Math.min(sueldoMin, sueldo);
        }
        System.out.println("El sueldo maximo es de: " + sueldoMax);
        System.out.println("El sueldo minimo es de " + sueldoMin);
    }
    
}
