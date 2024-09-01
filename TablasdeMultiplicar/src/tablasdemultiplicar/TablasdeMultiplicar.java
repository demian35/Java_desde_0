/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablasdemultiplicar;

import java.util.Scanner;

/**
 *
 * @author josed
 * programa para sacar las tablas de multiplicar del 1 al 12
 */
public class TablasdeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, multiplicacion;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        numero=entrada.nextInt();
        System.out.println("La tabla del " + numero + " es: ");
        //bucle for para mutiplicar la entrada
        for(int i=1;i<=10;i++){
            multiplicacion=numero*i;
            System.out.println(" "+ i +" x " + numero +" = " + multiplicacion);
        }
    }
    
}
