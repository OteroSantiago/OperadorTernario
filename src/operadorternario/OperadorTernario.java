/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce la edad de la persona: ");
        var edad = ent.nextInt();
        
        var mensaje = (edad > 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensaje);
        
    }
    
}
