/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desplazaarreglo;

import java.util.Scanner;

/**
 *
 * @author josed
 */
public class DesplazaArreglo {

    /**
     * @param args the command line arguments
     * programa que deplazara n veces el arreglo
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here
        int miArreglo[]=new int[10];
        int ultimoElemento;//variable donde guardaremos el ultimo elemento de miArreglo
        
        Scanner entrada= new Scanner(System.in);
        
        //poblamos el arreglo
        for(int i=0;i<10;i++){
            System.out.println((i+1)+" Ingrese un numero");
            miArreglo[i]=entrada.nextInt();
        }
        
        //imprimimos el arreglo temporal
        for(int i=0;i<10;i++){
            System.out.println(miArreglo[i]);
            
        }
        
        System.out.println("Ingrese cuantos desplazamientos quiere hacer");
        int dezplazamientos=entrada.nextInt();//le pasamos la entrada al usuario
        for(int j=0;j<dezplazamientos;j++){
             ultimoElemento=miArreglo[9];//variable donde guardaremos siempre el ultimo elemento del arreglo
            //hacemos que el arreglo se recorra una posision excluyendo la ultima posicion
            for(int i=8;i>=0;i--){
                miArreglo[i+1]=miArreglo[i];//movemos hacia delante el arreglo
            }
              miArreglo[0]=ultimoElemento;//el ultimo elemento sera el primero
        }
        
       
        
        
        System.out.println("Nuevo Arreglo");
        //imprimimos el arreglo final
        for(int i=0;i<miArreglo.length;i++){
            System.out.println(miArreglo[i]);
            
        }
    }
    
}
