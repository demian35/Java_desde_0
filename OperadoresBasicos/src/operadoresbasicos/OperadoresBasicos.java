/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresbasicos;

import java.util.Scanner;

/**
 *
 * @author josed
 */
//clase para mostrar como usar los operadores basicos en java
public class OperadoresBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double numero1,numero2,suma,resta,mult,div,rem;
        Scanner entrada= new Scanner(System.in);//entrada para que el usuario digite los numeros a operar
        System.out.println("Ingrese dos numeros ");
        numero1=entrada.nextDouble();
        numero2=entrada.nextDouble();
        suma=numero1+numero2;
        resta=numero1-numero2;
        mult=numero1*numero2;
        div=numero1/numero2;
        rem=numero1%numero2;
        
        //resultado suma
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + suma);
        
        //resutado resta
        System.out.println("La diferencia de " + numero1 + " y " + numero2 + " es " + resta);
        
        //resutado producto
        System.out.println("El producto de " + numero1 + " y " + numero2 + " es " + mult);
        
        //resultado division
        System.out.println("El cociente de " + numero1 + " y " + numero2 + " es " + div);
        
        //resultado modulo
        System.out.println("El residuo de " + numero1 + " y " + numero2 + " es " + rem);
        
    }
    
}
