/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Problema 2
        // Declaración de variables
        String a, b, c;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el valor de x");
        a = entrada.nextLine();
        
        System.out.println("Por favor ingrese el valor de y");
        b = entrada.nextLine();
        
        System.out.println("Por favor ingrese el valor de z");
        c = entrada.nextLine();
        
        //cambio de cadena a decimal
        
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        double z = Double.parseDouble(c);
        
        // operación
        double m = (x + (y / z))/(x - (y / z));
        
        // Respuesta
        System.out.printf("El valor de m, en base a las variables: \n"+
                "x = %s\n\t"+"y = %s\n\t\t"+"z = %s\n", x, y, z);
        
        System.out.printf("El resultado es: \n\t\t\t m = %.2f\n", m);
        
    }
    
}
