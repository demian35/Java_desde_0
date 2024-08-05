/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2sueldos;

/**
 *
 * @author josed
 * Ejercicio 2 calcular el sueldo total por una semana de un empleado
 */
public class Ejercicio2Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int horasTrabajo=40;//horas de trabajo totales a la semana considerando que la jornada por dia es de 8hrs
        double sueldo=100.00; //sueldo por hora
        
        double sueldosemanal= sueldo*horasTrabajo;
        
        
        System.out.println("Tu sueldo total a la semana es de: " + sueldosemanal);
    }
    
}
