/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7.pkg8.pkg3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joseconejerosivo
 */
public class Actividad783 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int num1; // este numero es la base
        int num2; // este es el exponente
        int resultado;
        int acumulador=0;
        int contador=0;
        BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Introduce la base");
        num1= Integer.parseInt(teclado.readLine());
        System.out.println("Introduce el exponente");
        num2= Integer.parseInt(teclado.readLine());
        do {
            //resultado = num1;
        for ( int i = num2; i <= num2; i++)
        {
            resultado = num1*num1;
            acumulador = resultado *resultado;
            contador++; 
        }
        } while (contador !=num2 );
        System.out.println("la potencia es" + acumulador);
    }
    
}
