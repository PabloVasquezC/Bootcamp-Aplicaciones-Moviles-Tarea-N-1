package org.example;
import java.util.Scanner;


/*
* String
* Int
* double
* float
* Boolean
*
* variables
*
* condicionales
*
* bucles
*
* funciones
*
*
*
* */
public class Main {
    public static void main(String[] args) {

        //Instanciamos un Scanner y le asignamos el nombre: leer
        Scanner leer = new Scanner(System.in);

        // Crear un array de objetos Alumno
        Alumno[] alumnos = new Alumno[3];

        // Ingresar y leer datos para cada alumno
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            String nombre = leer.nextLine();
            System.out.print("Ingrese el apellido del alumno " + (i + 1) + ": ");
            String apellido = leer.nextLine();
            System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
            int edad = leer.nextInt();
            System.out.print("Ingrese el promedio del alumno " + (i + 1) + ": ");
            float promedio = leer.nextFloat();
            leer.nextLine(); // Limpiar el buffer del scanner
            System.out.println(" ");

            // Crear un objeto Alumno con los datos ingresados
            alumnos[i] = new Alumno(nombre, apellido, edad, promedio);
        }

        // Ordenar los alumnos por promedio
        ordenarPorPromedio(alumnos);

        // Imprimir los datos ordenados
        System.out.println("\nDatos de los alumnos ordenados por promedio:");

        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("Edad: " + alumno.getEdad());
            System.out.println("Promedio: " + alumno.getPromedio());
            System.out.println();
        }

        // Definir los caracteres para la carita feliz
        char cabeza = '\u263A'; // Carácter Unicode para el rostro sonriente

        // Imprimir la carita feliz
        System.out.println(cabeza);
    }

    // Método para ordenar los alumnos por promedio (usando el algoritmo de burbuja)
    private static void ordenarPorPromedio(Alumno[] alumnos) {
        int n = alumnos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (alumnos[j].getPromedio() < alumnos[j + 1].getPromedio()) {
                    // Intercambiar alumnos[j] y alumnos[j+1]
                    Alumno temp = alumnos[j];
                    alumnos[j] = alumnos[j + 1];
                    alumnos[j + 1] = temp;
                }
            }
        }
    }
}