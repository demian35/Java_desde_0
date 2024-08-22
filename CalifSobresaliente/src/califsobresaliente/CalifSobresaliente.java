/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package califsobresaliente;

import javax.swing.JOptionPane;

/**
 *
 * @author josed
 * Programa que detecta cuando una calificacione es buena o mala
 */
public class CalifSobresaliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float calificacion=Float.parseFloat(JOptionPane.showInputDialog("ingrese la calificaciom: "));
        
        if(calificacion <=5.9f){
            JOptionPane.showConfirmDialog(null, "Calificacion insuficiente");
        }else if(calificacion <=7.9f){
            JOptionPane.showConfirmDialog(null, "Calificacion suficiente");
        }else if(calificacion==8.0f){
            JOptionPane.showConfirmDialog(null, "Buena Calificacion");
        }else if(calificacion <=10.0f){
            JOptionPane.showConfirmDialog(null, "Excelente Calificacion");
        }
    }
    
}
