/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7.pkg3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joseconejerosivo
 */
public class Actividad73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int num;
        int num2;
        System.out.println("Introduce un lado del cuadrado");
        BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
         num = Integer.parseInt(teclado.readLine());
         num2 = num * num;
         System.out.print("El area del cuadrado es:");
         System.out.println(num2);
    }
    
}
