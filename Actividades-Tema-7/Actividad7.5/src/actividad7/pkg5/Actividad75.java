/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7.pkg5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joseconejerosivo
 */
public class Actividad75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int num;
        int resultado;
        int num1;
        int num2;
        int num3;
        BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Introduce un numero de hasta tres digitos");
        num = Integer.parseInt(teclado.readLine());
        if (num >= 10 & num <= 99)
        {
            num1 = (num/10);
            num2 = (num %10);
            resultado = num1 + num2;
            System.out.println("El resultado de sumar los digitos de num es:");
            System.out.println(resultado);
        } else if (num >=100 & num <= 999)
        {
            num1 = num/100;
            num2 = (num%100)/10;
            num3 = num%10;
            resultado= num1+num2+num3;
            System.out.println("El resultado de sumar los digitos de num es:");
            System.out.println(resultado);
        }else {System.out.println("No se puede dividir por esos digitos");}
    }
    
}
