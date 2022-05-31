/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7.pkg2;
import java.util.Scanner;

/**
 *
 * @author joseconejerosivo
 */
public class Actividad72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args []) {
        // TODO code application logic here
        int num = 10;
         Scanner leer = new Scanner (System.in);
            String mensaje;
            System.out.println("Introduce el valor del Numero");
            num = leer.nextInt();
            mensaje = ((num % 2) != 0) ? "el numero es impar" : "el numero es par";
            System.out.println(mensaje);
    }
    
}
