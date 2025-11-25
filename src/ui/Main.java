package ui;

import data.GestorDatos;
import model.CentroCultivo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static boolean isFinished = false;
    static ArrayList<CentroCultivo> centros;

    public static void main(String[] args) throws FileNotFoundException {
        centros = GestorDatos.centerlist(); //Copia el ArrayList en GestorDatos

        System.out.println("Bienvenido a Salmontt.");

        while (!isFinished) {
            menu();
        }
        scanner.close();
    }

    public static void menu() {
        System.out.println("-----------------------------------------");
        System.out.println("¿Qué desea hacer?");
        System.out.println("Ingrese '1' para ver la lista completa.");
        System.out.println("Ingrese '2' para filtrar los Centros de Cultivo por toneladas producidas.");
        System.out.println("Ingrese '3' para salir.");
        try {
            int opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1: {
                    desplegarLista();
                    break;
                }
                case 2: {
                    filtrarLista();
                    break;
                }
                case 3: {
                    System.out.println("¡Nos vemos!");
                    isFinished = true;
                    System.exit(0);
                }
                default: {
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                }
            }
        } catch (NumberFormatException e) { //Maneja error de formato.
            System.out.println("Error: Se ha ingresado un valor inválido. La operación ha sido cancelada.");
            System.exit(0); //Se termina la ejecución.
        }
    }

    public static void desplegarLista() {
        for (CentroCultivo centro : centros) { //Recorrido del ArrayList
            System.out.println(centro);
        }
    }

    public static void filtrarLista() {
        System.out.println("Ingrese un número para mostrar los centros que superaron el valor (en toneladas) en producción.");
        try {
            int opcion = Integer.parseInt(scanner.nextLine());
            if (opcion > 0) {
                for (CentroCultivo centro : centros) {
                    if (centro.getProduccion() > opcion) {  //Se establece un filtro de centros con producción mayor al valor ingresado.
                        System.out.println(centro);
                    }
                }
            } else {
                System.out.println("Ingrese un número mayor a 0.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Se ha ingresado un valor inválido. La operación ha sido cancelada.");
            System.exit(0);
        }
    }
}
