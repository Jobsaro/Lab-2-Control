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
public class Gomez_Jocsan_NOTAS {

    /**
     * @param args the command line arguments
     */
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    
    public static void ejecutar() {
        Scanner entrada = new Scanner(System.in);
        int cantidadNota = 0;
        
        while(cantidadNota <= 0){
            System.out.println("Ingrese la cantidad de notas: ");
            cantidadNota = entrada.nextInt();
            if(cantidadNota<=0){
                System.out.println(ANSI_RED+"La cantidad de notas debe ser un numero positvo");
            }
        }
        
        double[]notas = new double[cantidadNota];
        double suma = 0;
        double notaMayor= 0;
        double notaMenor = 100;
        int contador = 0;
        
        
        while(contador<cantidadNota){
            System.out.println("Nota "+(contador+1)+": ");
            double nota = entrada.nextDouble();
            
            if(nota>=0&&nota<=100){
                suma+=nota;
                
                if(nota>notaMayor){
                    notaMayor = nota;
                }
                if(nota<notaMenor){
                    notaMenor=nota;
                }
                
                contador++;
            }
            else{
                System.out.println(ANSI_RED+"La nota tiene que estar entr 0 a 100.");
            }
        }
        double promedio = suma/cantidadNota;
        
        System.out.printf(ANSI_GREEN+"Promedio: %.2f%%\n", promedio);
        System.out.printf(ANSI_GREEN+"Nota mayor: %.2f\n", notaMayor);
        System.out.printf(ANSI_GREEN+"Nota menor: %.2f\n", notaMenor);
    }
    
}
