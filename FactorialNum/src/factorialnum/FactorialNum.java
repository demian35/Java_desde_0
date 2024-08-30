/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialnum;

import java.util.Scanner;

/**
 *
 * @author josed
 * programa que calcula el factorial de un numero
 */
public class FactorialNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        long factorial=1;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero=entrada.nextInt();
        for(int i=1;i<=numero;i++){
            factorial*=i;
        }
        System.out.println("El factorial de "+numero+ " es: "+factorial);
    }
    
}
