/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desglozanumeros;

import java.util.Scanner;

/**
 *
 * @author josed
 */
public class Desglozanumeros {

    /**
     * @param args the command line arguments
     * programa para desglozar un numero de for
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner entrada= new Scanner(System.in);//le pedimos un numero al usuario
        System.out.println("Ingrese un numero");
        numero=entrada.nextInt();
        
        //for para descomponer el numero, imprimimos el iterador
        for(int i=1;i<=numero;i++){
            System.out.println(i);
        }
        
    }
    
}
