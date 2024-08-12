/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparaciondosnumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author josed
 * programa que compara si dos numeros son iguales o cual es mayor o menor
 */
public class ComparaciondosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // le pedimos al usuario que ingrese dos numeros
        int numeroA=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero: "));
        int numeroB=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero: "));
        
        if(numeroA==numeroB){
            JOptionPane.showConfirmDialog(null, numeroA + " y " + numeroB + " son iguales");
        }else if(numeroA>numeroB){
            JOptionPane.showConfirmDialog(null, numeroA + " es mayor a " + numeroB);
        }else{
            JOptionPane.showConfirmDialog(null, numeroB + " es mayor a " + numeroA);
        }   
    }
    
}
