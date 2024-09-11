/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mesclaarreglo;

import java.util.Scanner;

/**
 *
 * @author josed
 */
public class MesclaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        int miArregloA[]=new int[12];
        int miArregloB[]=new int[12];
        int miArregloC[]=new int[miArregloA.length + miArregloB.length];
        Scanner entrada= new Scanner(System.in);
        
        //poblamos el primer arreglo
        for(int i=0;i<miArregloA.length;i++){
            System.out.println((i+1)+"Inserte los elementos del arreglo A");
            miArregloA[i]=entrada.nextInt();
        }
        
        
        //poblamos el segundo arreglo
        for(int i=0;i<miArregloB.length;i++){
            System.out.println((i+1)+"Inserte los elementos del arreglo B");
            miArregloB[i]=entrada.nextInt();
        }
        
        
        //concatenamos a con c
        for(int i=0;i<miArregloA.length;i++){
            miArregloC[i]=miArregloA[i];
        }
        
        //concatenamos b con C
        for(int i=0;i<miArregloB.length;i++){
            miArregloC[miArregloA.length+i]=miArregloB[i];
        }
        
        //poblamos el arreglo c donde mesclaremos los arreglos
        int j=0;//variable para iterar en el arregloC
        for(int i=2;i<miArregloA.length;i+=3){
            miArregloC[j]=miArregloA[i];//insertamos el primer elemento del arregloA
            j++;//avanzamos en C
            miArregloC[j]=miArregloB[i];//insertamos el primer elemento del arregloB
            j++;//avanzamos en c
        }
        
        //imprimimos el arregloC
        for(int i=0;i<miArregloC.length;i++){
            System.out.print(miArregloC[i]+ " ");
        }
   
    }
    
}
