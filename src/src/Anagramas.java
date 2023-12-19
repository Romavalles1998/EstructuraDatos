package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Anagramas {

    public static void main(String[] args) throws IOException {
        Map<String, List<String>> anagramasMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\allsk\\IdeaProjects\\spanish-dict.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                procesarPalabra(line, anagramasMap);
            }
        }

        imprimirAnagramas(anagramasMap, 2); // Puedes ajustar el valor según tus necesidades
    }

    public static void procesarPalabra(String palabra, Map<String, List<String>> anagramasMap) {
        char[] letrasOrdenadas = palabra.toCharArray();
        Arrays.sort(letrasOrdenadas);
        String clave = new String(letrasOrdenadas);

        anagramasMap.computeIfAbsent(clave, k -> new ArrayList<>()).add(palabra);
    }

    private static void imprimirAnagramas(Map<String, List<String>> anagramasMap, int minGroupSize) {
        for (List<String> grupo : anagramasMap.values()) {
            if (grupo.size() >= minGroupSize) {
                System.out.println(grupo);
            }
        }
    }
}


