package main.controllers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicios {

    public static Map<String, Integer> contarFrecuenciaDePalabras(String text) {
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();
        String[] palabras = text.toLowerCase().split("\\W+");
        
        for (String palabra : palabras) {
            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }
        
        return frecuenciaPalabras;
    }

    public static boolean verificarCaracteresUnicos(String input) {
        Set<Character> caracteres = new HashSet<>();
        
        for (char c : input.toCharArray()) {
            if (!caracteres.add(c)) {
                return false;
            }
        }
        
        return true;
    }
}
