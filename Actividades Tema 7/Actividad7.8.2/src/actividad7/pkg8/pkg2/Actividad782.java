/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7.pkg8.pkg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joseconejerosivo
 */
public class Actividad782 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        double num;
        double num1;
        double resultado;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce la base del triangulo");
        num = Integer.parseInt(teclado.readLine());
        System.out.println("Introduce la altura del triangulo");
        num1 = Integer.parseInt(teclado.readLine());
        if (num >= 1 & num1 >=1)
        {
            resultado = (num* num1)/2;
            System.out.println("El area del triangulo es:" + resultado);
        } else {System.out.println("No se puede calcular su area");}
    }
    
}
