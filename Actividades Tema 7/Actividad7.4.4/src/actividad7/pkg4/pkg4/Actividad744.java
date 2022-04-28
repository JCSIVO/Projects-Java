/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7.pkg4.pkg4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joseconejerosivo
 */
public class Actividad744 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int opcion;
        BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("1. Lunnes");
        System.out.println("2. Martes");
        System.out.println("3. Miercoles");
        System.out.println("4. Jueves");
        System.out.println("5. Viernes");
        System.out.println("6. Sabado");
        System.out.println("7. Domingo");
        System.out.println("Escoge un dia de la semana");
        opcion = Integer.parseInt(teclado.readLine());
        
        if (opcion == 1)
        {
          System.out.println("Psicomotricidad");
        } else if (opcion == 2 | opcion == 4) 
        {
         System.out.println("Natacion");
        } else if (opcion == 3){
            System.out.println("musica");
        } else if (opcion == 5){
            System.out.println("Descanso");
        } else if (opcion == 6 | opcion == 7){
            System.out.println("dia sin actividades");
        }else {
            System.out.println("Dia inexsistente");
        }
    }
        
    
}
