import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        System.out.println("Introduce palabras (una por línea). Deja una línea en blanco para finalizar:");

        while (true) {
            String palabra = scanner.nextLine().trim();

            if (palabra.isEmpty()) {
                break;
            }

            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }

        System.out.println("Resultados:");
        mostrarFrecuencias(frecuenciaPalabras);
    }

    public static void mostrarFrecuencias(Map<String, Integer> frecuenciaPalabras) {
        for (Map.Entry<String, Integer> entry : frecuenciaPalabras.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
