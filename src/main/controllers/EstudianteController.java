package main.controllers;

import main.models.Estudiante;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class EstudianteController {

    public Map<String, List<Estudiante>> procesarEstudiantes(Estudiante[] estudiantes) {
        Arrays.sort(estudiantes, Comparator.comparingInt(Estudiante::getCalificacion));

        Map<String, List<Estudiante>> agrupadosPorCategoria = new HashMap<>();

        for (Estudiante estudiante : estudiantes) {
            String categoria = obtenerCategoria(estudiante.getCalificacion());
            agrupadosPorCategoria.putIfAbsent(categoria, new ArrayList<>());
            agrupadosPorCategoria.get(categoria).add(estudiante);
        }

        return agrupadosPorCategoria;
    }

    public String obtenerCategoria(int calificacion) {
        if (calificacion >= 90) {
            return "A";
        } else if (calificacion >= 80) {
            return "B";
        } else if (calificacion >= 70) {
            return "C";
        } else if (calificacion >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
