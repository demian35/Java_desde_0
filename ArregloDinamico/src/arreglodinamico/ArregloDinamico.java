/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglodinamico;

import java.util.Scanner;

/**
 *
 * @author josed
 * programa donde se programa una tabla dinamica 
 */
public class ArregloDinamico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int miArreglo[]= new int[10];
        Scanner entrada=new Scanner(System.in);
        
        //poblamos el arreglo hasta la septima casilla
        for(int i=0;i<7;i++){
            if(i<7){
                 System.out.println((i+1)+"Inserte los elementos del arreglo ");
                 miArreglo[i]=entrada.nextInt();
            }
        }
        //imprimimos el arreglo temporal
         for (int i = 0; i < miArreglo.length; i++) {
            System.out.println(miArreglo[i]);
        }
        
        //poblamos el resto del arreglo
        for(int i=7;i<=9;i++){
            System.out.println("Desea llenar alguna otra casilla"+ "1 si " + "0 no");
            int opcion=entrada.nextInt();
            
            if(opcion==1){
                System.out.println("ingrese un indice entre 1-9");
                int indice=entrada.nextInt();
                if(indice>=0 && indice<=9){
                    System.out.println("inserte un numero");
                    miArreglo[indice]=entrada.nextInt();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        
        for (int i = 0; i < miArreglo.length; i++) {
            System.out.println(miArreglo[i]);
        }
        
    }
        
}
    

