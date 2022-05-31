/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7.pkg3.pkg1;

import java.io.IOException;

/**
 *
 * @author joseconejerosivo
 */
public class Actividad731 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        char letra;
        char letra1;
        System.out.println("Introduce una letra");
        letra = (char) System.in.read();
        letra1= ++letra ;
        System.out.println("la letra que le sigue es:");
        System.out.println(letra1);
    }
    
}
