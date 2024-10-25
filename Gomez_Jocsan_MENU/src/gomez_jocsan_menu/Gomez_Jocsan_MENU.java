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
public class Gomez_Jocsan_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner eleccion = new Scanner(System.in);
        boolean menu = true;
        int opcion;
        System.out.println("===== MENU DE EJERCICIOS =====");
        System.out.println("1. Cadena");
        System.out.println("2. Notas");
        System.out.println("3. Clases");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
        opcion = eleccion.nextInt();
        
        
        switch (opcion){
            
            case 1:
                Gomez_Jocsan_CADENA.ejecutar();
                break;
            
            case 2:
                Gomez_Jocsan_NOTAS.ejecutar();
                break;
                
            case 3:
                Gomez_Jocsan_CLASES.ejecutar();
                break;
                
            case 4:
                System.out.println("Se ha cerrado el programa.");
                break;
    }
    
}
    
}
