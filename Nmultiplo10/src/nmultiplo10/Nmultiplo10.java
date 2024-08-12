/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nmultiplo10;

import javax.swing.JOptionPane;

/**
 *
 * @author josed
 * Programa para verificar si un numero es multiplo de 10
 */
public class Nmultiplo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if(numero %10==0){
            JOptionPane.showConfirmDialog(null,numero + " es multiplo de 10");
        }else{
            JOptionPane.showConfirmDialog(null,numero + " no es multiplo de 10");
        }
    }
    
}
