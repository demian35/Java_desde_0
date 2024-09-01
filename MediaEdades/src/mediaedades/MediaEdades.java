/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaedades;

import java.util.Scanner;

/**
 *
 * @author josed
 * programa que calcula las medias de edades entre 5 alunmos
 */
public class MediaEdades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad,sumaEdades=0, contadorEdad=0,contadorEstatura=0, mediaEdad=0;
        double estatura, sumaEstatura=0.00, mediaEstatura=0.00;
        Scanner entrada= new Scanner(System.in);
        
        for(int i=0;i<=4;i++){
            System.out.println("Ingrese una edad: ");
            edad=entrada.nextInt();
            sumaEdades+=edad;
            System.out.println("Ingrese una estatura: ");
            estatura=entrada.nextDouble();
            sumaEstatura+=estatura;
            mediaEdad= sumaEdades/5;
            mediaEstatura=sumaEstatura/5;
            if(edad > 18){
                contadorEdad++;
            }if(estatura>1.75){
                contadorEstatura++;
            }   
        }
        System.out.println("la media de edad del grupo es de: "+ mediaEdad);
        System.out.println("La media de las estaturas del grupo es de: " +mediaEstatura);
        
        System.out.println("En el grupo hay " + contadorEdad + " mayores de 18");
        System.out.println("En el grupo hay "+ contadorEstatura + "mas altos de 1.75");
    }
    
}
