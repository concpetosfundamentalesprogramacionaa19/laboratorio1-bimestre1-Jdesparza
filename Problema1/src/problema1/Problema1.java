/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Problema 1
        // Declaración de variables
        int horas;
        double sueldo;
        int costo_hora;
        double descuento_seguro;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese la cantidad de horas de trabajo");
        horas = entrada.nextInt();
        
        System.out.println("Por favor ingrese el costo por hora");
        costo_hora = entrada.nextInt();
        
        // Presentación del sueldo y el descuento
        descuento_seguro = horas * costo_hora * 0.1;
        System.out.printf("El descuento del Seguro Social es: %.2f\n",
                descuento_seguro);
        
        sueldo = (horas * costo_hora) - descuento_seguro;
        System.out.printf("El sueldo mensual del trabajador es: %.2f\n", 
                sueldo);
        
        
        
    }
    
}
