/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crecienteodecreciente;

import java.util.Scanner;

/**
 *
 * @author josed
 * programa que indica si el arreglo esta ordenado de orden decreciente o creciente
 */
public class CrecienteoDecreciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int miArreglo[]= new int[10]; //arreglo de 10 enteros
        boolean esDecreciente=true;
        boolean esCreciente=true;
        
        Scanner entrada = new Scanner(System.in);
        
        //poblamos el arreglo
        for(int i=0;i<miArreglo.length;i++){
            System.out.println((i+1)+" Inserte un numero");
            miArreglo[i]=entrada.nextInt();
        }      
        
        for(int i=0; i<miArreglo.length-1;i++){
            if(miArreglo[i]<miArreglo[i+1]){
                esDecreciente=false; //si se encuentra un valor en orden ascendiente cambiamos esDecreciente a falso
            }else if(miArreglo[i]>miArreglo[i+1]){
                esCreciente=false; //si se encuentra un valor en orden decreciente cambiamos es decreciente a falso
            }
        }
        
        if(esCreciente){
            System.out.println("El arreglo va en orden creciente");
        }else if(esDecreciente){
            System.out.println("El arreglo va en orden decreciente");
        }else{
            System.out.println("El arreglo esta completamente desordenado");
        }
    }
    
}
