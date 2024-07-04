/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

/**
 *
 * @author josed
 */

/*
Clase para mostrar cuales son los tipos primitivos de datos
*/
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        byte entero=5; //tipo byte puede almacenar 8 bits desde -128 a 127
        System.out.println("Tipo byte: " + entero);
        
        short entero2=323;//tipo short solo puede almacenar 16 bits
        System.out.println("Tipo short: " + entero2);
        
        int entero3=1222;//Tipo int solo puede almacenar 32 bits
        System.out.println("Tipo int: " + entero3);
        
        long entero4=1345555;//Tipo long solo puede almacenar 64 bits
        System.out.println("Tipo long: " + entero4);
        
        float numFlotante=3.2f;/*decimal en punto flotante puede almacenar
        puede almacenar 32 bits se tiene que poner f al final del numero */
        
        System.out.println("Numero en punto flotante: " + numFlotante);
        
        double numdecimal=3.33;//decimal double sintaxis tradicional almacena 64 bits
        System.out.println("Numero decimal tipo double: " + numdecimal);
        
        char caracter='ñ';//tipo char para caracteres
        System.out.println("Caracter: " + caracter);
        
        boolean valorVerdad= true; //tipo boolean para desiciones o asignar valores de verdad
        System.out.println("Valor: "+ valorVerdad);
    }
    
}
