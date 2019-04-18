/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;
import paquete1.MiClase1; 
import paquete2.MiClase2;
import paquete3.MiClase3;
/**
 *
 * @author Salas
 */
public class Principal {
    public static void main(String[] args){
        // Expresion logica para determinar si es mayor de edad
        String resultado = MiClase1.edad>=18 ? "mayor de edad" : 
                "menor de edad";
        
        // Presentación de resultados
        System.out.printf("Nombre: \n\t%s\nApellido: \n\t%s\nEdad: \n\t%s "
                + "y %s\n", 
                MiClase2.nombre, MiClase3.apellido, MiClase1.edad, resultado);
    }
}