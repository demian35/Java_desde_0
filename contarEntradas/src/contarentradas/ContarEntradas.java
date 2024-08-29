/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contarentradas;

import javax.swing.JOptionPane;

/**
 *
 * @author josed
 * programa para contar cuantas entradas ha digitado el usuario
 */
public class ContarEntradas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        int contador=0;
        numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));//le pedimos al usuario que ingrese
        
        while(numero>=0){
            contador++;//si se ingresa un numero entonces aumentamos el contador
            JOptionPane.showConfirmDialog(null, "Ingresaste" + numero + "Numeros ingresados: " + contador);
             numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
        }
    }
    
}
