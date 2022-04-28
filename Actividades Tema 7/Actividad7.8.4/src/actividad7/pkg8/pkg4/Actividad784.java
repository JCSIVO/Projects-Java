/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7.pkg8.pkg4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author joseconejerosivo
 */
public class Actividad784 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         char letra ;
        //BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un caracter cualquiera");
        Scanner sc = new Scanner(System.in);
        letra = sc.next().charAt(0);
        char a=0;
        char e=0;
        char i=0;
        char o=0;
        char u=0;
        if(letra == a|| letra == e|| letra ==i||letra ==o||letra==u)
        {
            System.out.println("Has escrito una consonante");
        } else 
        
            System.out.println("Verdadero has escrito una vocal");
        
           
        }
    
}
