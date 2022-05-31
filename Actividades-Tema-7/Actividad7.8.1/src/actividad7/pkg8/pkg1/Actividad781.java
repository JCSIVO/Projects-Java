/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7.pkg8.pkg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joseconejerosivo
 */
public class Actividad781 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int num;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un lado del cuarado");
        num = Integer.parseInt(teclado.readLine());
        if (num >= 1)
        {
            num = num* num;
            System.out.println("El area del cuadrado es:" + num);
        } else {System.out.println("No se puede calcular su area");}
    }
    
}
