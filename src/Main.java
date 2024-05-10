package Ejercicio2;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que introduzca la ruta del archivo o directorio
        System.out.println("Introduce la ruta del fichero o directorio:");
        String ruta = scanner.nextLine();

        // Crea una instancia de File con la ruta introducida
        File file = new File(ruta);

        // Verifica si el fichero/directorio existe
        if (file.exists()) {
            System.out.println("El fichero/directorio existe.");

            // Verifica si es un directorio o un fichero
            if (file.isDirectory()) {
                System.out.println("Es un directorio.");
            } else if (file.isFile()) {
                System.out.println("Es un fichero.");
                // Muestra información del fichero
                System.out.println("Nombre: " + file.getName());
                System.out.println("Tamaño: " + file.length() + " bytes");
                if (file.canRead()) {
                    System.out.println("Permisos de lectura: Sí");
                } else {
                    System.out.println("Permisos de lectura: No");
                }
                if (file.canWrite()) {
                    System.out.println("Permisos de escritura: Sí");
                } else {
                    System.out.println("Permisos de escritura: No");
                }
            }
        } else {
            System.out.println("El fichero/directorio no existe.");
        }

    }
}
