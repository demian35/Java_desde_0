/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentaaprobados;

import java.util.Scanner;

/**
 *
 * @author josed
 * Programa que cuenta entre 6 calificaciones cuantos aprobados y reprobados hay
 */
public class CuentaAprobados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aprobados=0,suspensos=0,condicionados=0;
        double calificacion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa las calificaciones del grupo ");
        for(int i=1;i<=6;i++){
            do{
                calificacion=entrada.nextDouble(); 
            }while(calificacion<0||calificacion>10);
           
            if(calificacion>=5.0){
                aprobados++;
            }else if(calificacion==4.0){
                condicionados++;
            }else if(calificacion<4.0){
                suspensos++;
            }
        }
        System.out.println("En este grupo hay: " +aprobados + " alumnos aprobados " 
        + condicionados + " alumnos condicionados " +suspensos +" alumnos con"
                + "riesgo de reprobar ");
        
        
    }
    
}
