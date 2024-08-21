/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package longituddenumero;

import javax.swing.JOptionPane;

/**
 *
 * @author josed
 * programa para decir cuantas cifras tiene un numero
 */
public class LongitudDeNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        String numeroCadena= numero +"";
        if(numeroCadena.length()==1){
            JOptionPane.showConfirmDialog(null, "La longitud del numero es de una cifra ");
        }else if(numeroCadena.length()==2){
            JOptionPane.showConfirmDialog(null, "La longitud del numero es de dos cifras");
        }else if(numeroCadena.length()==3){
            JOptionPane.showConfirmDialog(null, "La longitud del numero es de tres cifras");
        }else if(numeroCadena.length()==4){
            JOptionPane.showConfirmDialog(null, "La longitud del numero es de cuatro cifras");
        }else if(numeroCadena.length()==5){
            JOptionPane.showConfirmDialog(null, "La longitud del numero es de cinco cifras");
        }else if(numeroCadena.length()>=6){
            JOptionPane.showConfirmDialog(null, "Solo se permiten como maximo numeros de 5 cifras");
        }
       
    }
    
}
