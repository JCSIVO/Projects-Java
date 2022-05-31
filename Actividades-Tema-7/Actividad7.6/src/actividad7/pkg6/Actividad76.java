/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7.pkg6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joseconejerosivo
 */
public class Actividad76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int num;
        int num1;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        do
        {
            System.out.println("Ingresa un numero");
            num= Integer.parseInt(teclado.readLine());
            for (int i=2; i<=num/2;i++)
            {
                num1=num%i;
                if (num1 ==0)
                {
                    System.out.println(num +"El numero no es primo");
                }else
                {
                    System.out.println(num +"El numero  es primo");
                }
            }
            
        }while (num !=-1);
    }
    
}
