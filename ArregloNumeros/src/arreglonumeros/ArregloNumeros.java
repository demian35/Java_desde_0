/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglonumeros;

import java.util.Scanner;

/**
 *
 * @author josed
 * programa para guardar numeros en un arreglo e imprimirlos ordenados
 */
public class ArregloNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creamos el arreglo
        int[] miArreglo= new int[5];
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingresa los elementos que quieres guardar en el arreglo");
        //bucle para acceder al arreglo e insertar los datos
        for(int i=0;i<miArreglo.length;i++){
            System.out.println((i+1) + " Ingresa un numero: ");
            miArreglo[i]=entrada.nextInt();//le pasamos la entrada al arreglo para que los inserte en cada ejecucion
        }
        System.out.println("\nElementos del arreglo");
        //foreach para imprimir los elementos del arreglo
        for(int i:miArreglo){
            System.out.println(i);
        }
        
    }
    
}
