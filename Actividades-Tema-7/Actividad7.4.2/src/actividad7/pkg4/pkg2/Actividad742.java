/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7.pkg4.pkg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joseconejerosivo
 */
public class Actividad742 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        double Num = 166.386;
        double num2;
        double resultado;
        BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Introduce el valor en pesetas");
        num2 = Double.parseDouble(teclado.readLine());
        if (num2 >0)
        {
        resultado = num2/Num;
        System.out.println("El valor en euros es;");
        System.out.println(resultado);
        }
        else 
        {
          System.out.println("El valor introducido es incorrecto");
        }
    }
    
}
