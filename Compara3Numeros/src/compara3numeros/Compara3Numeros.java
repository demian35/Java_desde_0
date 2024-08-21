/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compara3numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author josed
 * programa para comparar tres numeros e imprimirlos de mayor a menor
 * usando condicionales
 */
public class Compara3Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //pedimos los numeros al usuario
        int numeroA=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero: "));
        int numeroB=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero: "));
        int numeroC=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer numero: "));
        
        if(numeroA>numeroB && numeroB>numeroC){
             JOptionPane.showConfirmDialog(null, numeroA +","  + numeroB + ","+numeroC);
        }else if(numeroC>numeroB && numeroB>numeroA){
             JOptionPane.showConfirmDialog(null, numeroC +","  + numeroB +"," +numeroA);
        }else if(numeroB>numeroA && numeroA>numeroC){
             JOptionPane.showConfirmDialog(null, numeroB +","  + numeroA +"," +numeroC);
        }else if(numeroC>numeroA && numeroA>numeroB){
             JOptionPane.showConfirmDialog(null, numeroC +","  + numeroA +"," +numeroB);
        }else if(numeroA>numeroC && numeroC>numeroB){
             JOptionPane.showConfirmDialog(null, numeroA + "," + numeroC +"," +numeroB);
        }else if(numeroB>numeroC && numeroC>numeroA){
             JOptionPane.showConfirmDialog(null, numeroB +","  + numeroC +"," +numeroA);
        }
    }
    
}
