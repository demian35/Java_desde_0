/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinaelnumero;

import javax.swing.JOptionPane;

/**
 *
 * @author josed
 * juego para adivinar el numero que estoy pensando
 */
public class AdivinaelNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero,aleatorio;
        int intentos=0;
        aleatorio=(int)(Math.random()*100);//multuplicamos por 100 el numero generado para poder generar numeros del 1 al 100
        System.out.println(aleatorio);
        numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));//le pedimos al usuario que ingrese
        do{
           if(numero>aleatorio){
               System.out.println("Ingrese un numero menor");
               numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));       
           }else if(numero<aleatorio){
               System.out.println("Ingrese un numero mayor");
               numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
           }
           intentos++;
        }while(numero!=aleatorio);
        JOptionPane.showConfirmDialog(null,numero + " Adivinaste " + " con: "+ intentos +" Intentos" );
    }
    
    
}
