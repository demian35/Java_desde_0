/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocompras;

import javax.swing.JOptionPane;

/**
 *
 * @author josed
 * Programa que calcula el descuento de compras mayores a 300
 */
public class EjercicioCompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int articulos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de articulos comprados"));
        double importeTotal=0.00;
        //for para sumar todos los articulos
        for(int i=1;i<=articulos;i++){
            double precioArticulo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del articulo"));
            importeTotal += precioArticulo;
        }
        
        if(importeTotal>=300.0){
            double descuento=importeTotal*0.25;
            importeTotal -=descuento;
            String importeString= String.valueOf(importeTotal);
            JOptionPane.showConfirmDialog(null,importeString + " Total se le hace el 25% "
                    + "de descuento por que su compra fue mayor a 300");
        }else{
            String importeString= String.valueOf(importeTotal);
            JOptionPane.showConfirmDialog(null,importeString + " Total");
        }
    }
    
}
