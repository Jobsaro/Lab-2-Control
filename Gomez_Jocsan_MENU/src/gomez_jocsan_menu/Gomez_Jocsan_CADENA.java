/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gomez_jocsan_menu;

import java.util.Scanner;

/**
 *
 * @author DELL
 */

public class Gomez_Jocsan_CADENA {

    /**
     * @param args the command line arguments
     */
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m"; 
        // TODO code application logic here
    public static void ejecutar(){
            
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = entrada.nextLine();        
        char caracter = ' ';
        int repeticiones = 0;        
        int i = 0;
        
        while (i < cadena.length()){
            char actual = cadena.charAt(i);
            int contador = 0;
            int j = 0;
            
            while (j < cadena.length()){
                if (cadena.charAt(j) == actual){
                    contador++;
                }
                j++;
            }
            if (contador > repeticiones){
                repeticiones = contador;
                caracter = actual;
            }
            i++;
        }
        if (repeticiones > 1){
            System.out.println(ANSI_GREEN+"El caracter que mas se repite es '" + caracter + "' con " + repeticiones + " repeticiones.");
        } else {
            System.out.println(ANSI_YELLOW+"No hay ningun caracter repetido.");
        }
        
    }

}

