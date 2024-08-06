/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadradosuma;

import java.util.Scanner;

/**
 *
 * @author josed 
 * Programa para calcular el cuadrado de una suma
 */
public class CuadradoSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese los dos coeficientes A y B");
        double exponente=2.0;
        double coeficienteA=entrada.nextInt();
        double coeficienteB=entrada.nextInt();
        
        double sumaCuadrados=(Math.pow((double)coeficienteA, (double)exponente))
                +(Math.pow((double)coeficienteB, (double)exponente))
                +2*(coeficienteA*coeficienteB);
        
        System.out.println("La suma de (a+b)**2 "+" es: " + sumaCuadrados);
    }
    
}
