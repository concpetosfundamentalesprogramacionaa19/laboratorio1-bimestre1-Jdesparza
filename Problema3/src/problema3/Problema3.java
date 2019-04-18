/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Problema 3
        // Declaración de variables
        String a, b, c;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingrese la primera nota");
        a = entrada.nextLine();
        
        System.out.println("Por favor ingrese la segunda nota");
        b = entrada.nextLine();
        
        System.out.println("Por favor ingrese la tercera nota");
        c = entrada.nextLine();
        
        //cambio de cadena a decimal
        
        double nota1 = Double.parseDouble(a);
        double nota2 = Double.parseDouble(b);
        double nota3 = Double.parseDouble(c);
        
        // operación
        double promedio = (nota1 + nota2 + nota3)/3;
        
        // Respuesta
        System.out.printf("Su promedio es: %.2f\n", promedio);
        
        String resultado = promedio>=14 ? "Usted si paso el año" : 
                "Usted no paso el año";
        
        System.out.printf("Entonces: %s\n", resultado);
        
    }
    
}
