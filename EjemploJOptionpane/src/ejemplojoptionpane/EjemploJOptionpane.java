/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplojoptionpane;
import javax.swing.JOptionPane;
/**
 *
 * @author josed
 */

/*Case para recibir entradas del usuario con interfaz grafica java swing*/
public class EjemploJOptionpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        String cadena;
        double decimal;
        char simbolo;
        
        //le pedimos al usuario que ingrese el mensaje a mostrar
        cadena=JOptionPane.showInputDialog("Ingrese un mensaje");
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero")); /*showInputDialog
        es tipo cadena asi que para pasarle numeros o otros tipos de datos se tiene que convertir la entrada
        a cadena*/
        decimal=Double.parseDouble(JOptionPane.showInputDialog("ingrese un numero decimal"));
        //En el caso de un caracter solo hay que especificarle que guarde el primer digito de la cadena con charAt()
        simbolo=JOptionPane.showInputDialog("Ingrese cualquier caracter").charAt(0);
        
        //mostramos en una pestaña las entradas del usuario
        //cadena
        JOptionPane.showMessageDialog(null,cadena);
        //numero
        JOptionPane.showMessageDialog(null,numero);
        //decimal
        JOptionPane.showMessageDialog(null,decimal);
        //caracter
        JOptionPane.showMessageDialog(null,simbolo);
        
    }
    
}
