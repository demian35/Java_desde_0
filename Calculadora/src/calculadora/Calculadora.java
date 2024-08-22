/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author josed
 * Programa que simula una calculadora basica
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2, suma , resta , mult, div;
        char operacion;
        //le pedimos al usuario los numeros a operar
        num1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero: "));
        
        operacion=JOptionPane.showInputDialog("ingrese la operacion que desee realizar ").charAt(0);
        switch(operacion){
            case 'S':
            case 's':
                suma=num1+num2;//si el usuario teclea s suma
                 JOptionPane.showConfirmDialog(null, "El resultado de la suma es: " + suma);
            break;
            case 'R':
            case 'r':
                resta= num1-num2;//si el usuario teclea r resta
                  JOptionPane.showConfirmDialog(null, "El resultado de la resta es: " + resta );
            break;
            case 'P':
            case'p':
            case'M':
            case'm':
                mult=num1*num2;
                  JOptionPane.showConfirmDialog(null, "El resultado del producto es: " + mult);
            break;
            case 'D':
            case 'd':
                div=num1/num2;
                  JOptionPane.showConfirmDialog(null, "El resultado de la division es: " + div);
            break;
            default:
        }
    }
    
}
