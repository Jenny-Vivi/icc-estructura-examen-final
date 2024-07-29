package main;

import main.controllers.Ejercicios;
import main.controllers.EstudianteController;
import main.models.Estudiante;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Demostración de EstudianteController
        Estudiante[] estudiantes = {
            new Estudiante("Juan", 85),
            new Estudiante("María", 92),
            new Estudiante("Pedro", 78),
            new Estudiante("Ana", 88),
            new Estudiante("Luis", 75)
        };

        EstudianteController estudianteController = new EstudianteController();

        System.out.println("Estudiantes ordenados por calificación:");
        Arrays.sort(estudiantes, (e1, e2) -> Integer.compare(e1.getCalificacion(), e2.getCalificacion()));
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        Map<String, List<Estudiante>> agrupadosPorCategoria = estudianteController.procesarEstudiantes(estudiantes);

        System.out.println("\nAgrupación por categorías:");
        for (String categoria : agrupadosPorCategoria.keySet()) {
            System.out.println(categoria + ": " + agrupadosPorCategoria.get(categoria));
        }

        // Demostración de Ejercicios
        String texto = "Esta es una prueba. Esta prueba es solo una prueba.";
        Map<String, Integer> frecuenciaPalabras = Ejercicios.contarFrecuenciaDePalabras(texto);
        
        System.out.println("\nFrecuencia de palabras:");
        for (Map.Entry<String, Integer> entry : frecuenciaPalabras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String cadenaUnica = "abcdefg";
        boolean esUnica = Ejercicios.verificarCaracteresUnicos(cadenaUnica);
        System.out.println("\nLa cadena \"" + cadenaUnica + "\" tiene todos los caracteres únicos: " + esUnica);

        String cadenaNoUnica = "hello";
        boolean noEsUnica = Ejercicios.verificarCaracteresUnicos(cadenaNoUnica);
        System.out.println("La cadena \"" + cadenaNoUnica + "\" tiene todos los caracteres únicos: " + noEsUnica);
    }
}
