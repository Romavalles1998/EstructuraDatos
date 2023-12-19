package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LastNameFrequency {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\allsk\\IdeaProjects\\LastnameFrequencies.csv";
        Map<String, Integer> frequencyMap = cargarFrecuencias(filePath);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un apellido (o línea vacía para salir):");

        while (true) {
            String apellido = scanner.nextLine().trim();

            if (apellido.isEmpty()) {
                break;
            }

            mostrarFrecuencia(apellido, frequencyMap);
        }

        System.out.println("Programa finalizado.");
    }

    public static Map<String, Integer> cargarFrecuencias(String filePath) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] campos = line.split(",");
                if (campos.length >= 2) {
                    String apellido = campos[0].trim();
                    int frecuencia = Integer.parseInt(campos[1].trim());
                    frequencyMap.put(apellido, frecuencia);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return frequencyMap;
    }

    public static void mostrarFrecuencia(String apellido, Map<String, Integer> frequencyMap) {
        Integer frecuencia = frequencyMap.get(apellido);

        if (frecuencia != null) {
            System.out.println("Frecuencia de " + apellido + ": " + frecuencia);
        } else {
            System.out.println("El apellido no se encuentra en la base de datos.");
        }
    }
}
