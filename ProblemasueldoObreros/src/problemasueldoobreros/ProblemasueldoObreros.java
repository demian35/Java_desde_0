/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemasueldoobreros;

import javax.swing.JOptionPane;

/**
 *
 * @author josed
 * programa solucion sueldo obreros
 */
public class ProblemasueldoObreros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int horasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
        int sueldoTotal=0;
        if(horasTrabajadas<=40){
            sueldoTotal=16*horasTrabajadas;
            JOptionPane.showConfirmDialog(null,"Sueldo total: " + sueldoTotal);
        }else if(horasTrabajadas>40){
            int horasExtra=horasTrabajadas-40;
            sueldoTotal=(40*16) + (20*horasExtra);
             JOptionPane.showConfirmDialog(null,"Sueldo total: " + sueldoTotal);              
        }
        
    }
    
}
