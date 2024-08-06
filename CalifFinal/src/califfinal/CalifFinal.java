/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package califfinal;

import java.util.Scanner;

/**
 *
 * @author josed
 * Programa que calcula la calificacion final de un alunmo 
 */
public class CalifFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese las calificaciones del alumno");
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese las calificaciones de los examenes parciales");
        double cal1,cal2; //guardamos las calificaciones de los dos parciales
        cal1=entrada.nextFloat();
        cal2=entrada.nextFloat();
        double promedioParciales=(cal1+cal2)/2; //sacamos promedio de los dos parciales
        
        double puntosParciales=promedioParciales*0.50;//puntaje del promedio obtenido en los parciales
        
        System.out.println("Ingrese la calificacion de las participaciones");
        double participacion=entrada.nextDouble(); //guardamos la calificacion de participaciones
        
        double puntosPart=participacion*0.10;//puntaje del promedio en participaciones
        
        System.out.println("Ingrese la calificacion del examen final");
        double exFinal=entrada.nextDouble();//calificacion del examen final
        
        double puntosFinal=exFinal*0.40;//puntaje del promedio en el examen final
        
        double promedioFinal=puntosFinal+puntosPart+puntosParciales; //sumamos puntajes para sacar la calificacion final
        
        System.out.println("EL promedio final es de: " + promedioFinal);
       
        
        
    }
    
}
