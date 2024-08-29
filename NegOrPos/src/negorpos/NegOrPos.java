/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negorpos;

import javax.swing.JOptionPane;

/**
 *
 * @author josed
 */
public class NegOrPos {

    /**
     * @param args the command line arguments
     * programa para verificar si un numero es negativo o positivo
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        
        //verificamos si el numero es positivo o negativo con un bucle while
        while(numero!=0){//si el numero es diferente de 0 ejecutamos si recibe 0 se acaba la ejecucion
            if(numero>0){
                JOptionPane.showConfirmDialog(null, numero + "Es positivo");
            }else{
                JOptionPane.showConfirmDialog(null, numero + "Es negativo");
            }
             numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (0 para salir)"));
        }
    }
    
}
