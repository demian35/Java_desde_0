/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploscanner;

import java.util.Scanner;

/**
 *
 * @author josed
 */

/** Clase para mostrar el funcionamiento de la clase Scanner **/
public class EjemploScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        //recibimos una cadena como entrada
        
        String cadena;
        System.out.println("Ingrese una oracion");
        cadena=entrada.nextLine();
        System.out.println(cadena);
        
    }
    
}
