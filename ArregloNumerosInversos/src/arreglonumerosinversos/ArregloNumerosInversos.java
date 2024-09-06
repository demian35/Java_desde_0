/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglonumerosinversos;

import java.util.Scanner;

/**
 *
 * @author josed
 * programa para guardar numeros en un arreglo e imprimirlos ordenados
 */
public class ArregloNumerosInversos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creamos el arreglo
        int miArreglo[]= new int[5];
        
        Scanner entrada= new Scanner(System.in);
        
        //for para insertar los elementos en el arreglo
        System.out.println("Inserte los numeros en el array solo son 5");
        for(int i=0;i<miArreglo.length;i++){
            System.out.print((i+1)+ " Inserte un numero: ");
            miArreglo[i]=entrada.nextInt();
        }
        
        for(int i=4; i>=0;i--){
            System.out.println("arreglo invertido" + miArreglo[i]);
        }
    }
    
}
