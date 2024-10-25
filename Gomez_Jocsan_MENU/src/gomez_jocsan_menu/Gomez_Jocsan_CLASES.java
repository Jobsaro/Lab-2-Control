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

public class Gomez_Jocsan_CLASES {
    
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    
    public static void ejecutar() {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese la fecha actual en formato 'dia, DD/MM' (o 'x' para salir): ");
            String fecha = entrada.nextLine().trim().toLowerCase();
            
            if (fecha.equals("x")) {
                continuar = false;
                break;
            }

            int coma = fecha.indexOf(",");
            int slash = fecha.indexOf("/");
            if (coma == -1 || slash == -1) {
                System.out.println(ANSI_RED+"Formato de fecha incorrecto.");
                continue;
            }
            
            String diaSemana = fecha.substring(0, coma).trim();
            int dia = Integer.parseInt(fecha.substring(coma + 2, slash).trim());
            int mes = Integer.parseInt(fecha.substring(slash + 1).trim());
            if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
                System.out.println(ANSI_RED+"Dia o mes fuera de rango.");
                continue;
            }
            
            switch (diaSemana) {
                case "lunes":
                    System.out.println("Clase de Nivel inicial");
                    System.out.print("¿Se tomaron exámenes? (si/no): ");
                    String respuestaInicial = entrada.next().trim().toLowerCase();
                    if (respuestaInicial.equals("si")) {
                        System.out.print("Cantidad de alumnos aprobados: ");
                        int aprobadosInicial = entrada.nextInt();
                        System.out.print("Cantidad de alumnos no aprobados: ");
                        int noAprobadosInicial = entrada.nextInt();
                        int totalInicial = aprobadosInicial + noAprobadosInicial;
                        if (totalInicial > 0) {
                            double porcentajeAprobadosInicial = (aprobadosInicial * 100.0) / totalInicial;
                            System.out.printf(ANSI_GREEN+"Porcentaje de aprobados: %.2f%%\n", porcentajeAprobadosInicial);
                        } else {
                            System.out.println(ANSI_RED+"No se ingresaron datos validos de alumnos.");
                        }
                    }
                    entrada.nextLine();
                    break;
                case "martes":
                    System.out.println("Clase de Nivel intermedio");
                    System.out.print("¿Se tomaron examenes? (si/no): ");
                    String respuestaIntermedio = entrada.next().trim().toLowerCase();
                    if (respuestaIntermedio.equals("si")) {
                        System.out.print("Cantidad de alumnos aprobados: ");
                        int aprobadosIntermedio = entrada.nextInt();
                        System.out.print("Cantidad de alumnos no aprobados: ");
                        int noAprobadosIntermedio = entrada.nextInt();
                        int totalIntermedio = aprobadosIntermedio + noAprobadosIntermedio;
                        if (totalIntermedio > 0) {
                            double porcentajeAprobadosIntermedio = (aprobadosIntermedio * 100.0) / totalIntermedio;
                            System.out.printf(ANSI_GREEN+"Porcentaje de aprobados: %.2f%%\n", porcentajeAprobadosIntermedio);
                        } else {
                            System.out.println(ANSI_RED+"No se ingresaron datos validos de alumnos.");
                        }
                    }
                    entrada.nextLine();
                    break;
                case "miercoles":
                case "miercoles2": 
                    System.out.println("Clase de Nivel avanzado");
                    System.out.print("¿Se tomaron examenes? (si/no): ");
                    String respuestaAvanzado = entrada.next().trim().toLowerCase();
                    if (respuestaAvanzado.equals("si")) {
                        System.out.print("Cantidad de alumnos aprobados: ");
                        int aprobadosAvanzado = entrada.nextInt();
                        System.out.print("Cantidad de alumnos no aprobados: ");
                        int noAprobadosAvanzado = entrada.nextInt();
                        int totalAvanzado = aprobadosAvanzado + noAprobadosAvanzado;
                        if (totalAvanzado > 0) {
                            double porcentajeAprobadosAvanzado = (aprobadosAvanzado * 100.0) / totalAvanzado;
                            System.out.printf(ANSI_GREEN+"Porcentaje de aprobados: %.2f%%\n", porcentajeAprobadosAvanzado);
                        } else {
                            System.out.println(ANSI_RED+"No se ingresaron datos validos de alumnos.");
                        }
                    }
                    entrada.nextLine(); 
                    break;
                case "jueves":
                    System.out.println("Clase de practica hablada");
                    System.out.print("Ingrese el porcentaje de asistencia: ");
                    double asistencia = entrada.nextDouble();
                    if (asistencia > 50) {
                        System.out.println(ANSI_GREEN+"Asistio la mayoria.");
                    } else {
                        System.out.println(ANSI_RED+"No asistio la mayoria.");
                    }
                    entrada.nextLine();
                    break;
                case "viernes":
                    System.out.println("Clase de ingles para viajeros");
                    if ((dia == 1 && (mes == 1 || mes == 7))) {
                        System.out.println("Comienzo de nuevo ciclo.");
                        System.out.print("Cantidad de alumnos del nuevo ciclo: ");
                        int cantidadAlumnos = entrada.nextInt();
                        System.out.print("Precio por alumno: ");
                        double precioPorAlumno = entrada.nextDouble();
                        double ingresoTotal = cantidadAlumnos * precioPorAlumno;
                        System.out.printf(ANSI_GREEN+"Ingreso total del nuevo ciclo: $%.2f\n", ingresoTotal);
                    }
                    entrada.nextLine();
                    break;
                default:
                    System.out.println(ANSI_RED+"Dia de la semana inexistente.");
            }
        }
    }
}