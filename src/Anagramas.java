import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class Anagramas {

    public static void main(String[] args) throws IOException {
        //OK
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
        //Supongo que sabes lo que sabes lo que haces
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


