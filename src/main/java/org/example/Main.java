package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Añadir persona");
            System.out.println("2. Mostrar todas las personas");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Para consumir el salto de línea restante

            switch (opcion) {
                case 1:
                    Persona persona = new Persona();
                    System.out.print("Ingrese el nombre: ");
                    persona.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el apellido: ");
                    persona.setApellido(scanner.nextLine());
                    System.out.print("Ingrese la fecha de nacimiento (dd/MM/yyyy): ");
                    persona.setFechaNacimiento(LocalDate.parse(scanner.nextLine(), formatter));
                    personas.add(persona);
                    System.out.println("Persona añadida con éxito.\n");
                    break;
                case 2:
                    System.out.println("Listado de personas:");
                    for (Persona p : personas) {
                        System.out.println("Nombre: " + p.getNombre() + ", Apellido: " + p.getApellido() + ", Fecha de nacimiento: " + p.getFechaNacimiento().format(formatter));
                    }
                    System.out.println();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.\n");
            }
        }

        scanner.close();
        System.out.println("Saliendo del programa...");
    }
}